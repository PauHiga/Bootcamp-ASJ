let botonIgual =  document.getElementById("botonigual")

let borrar =  document.getElementById("botonborrar")

let display =  document.getElementById("display")

let displayOperaciones =  document.getElementById("operaciones")

let botonesTeclado = document.getElementsByClassName("botonTeclado")

let botonesOperaciones = document.getElementsByClassName("botonOperacion")

let concat = false;
let igualPresionado = false;
let operaciones = "";
let operando1 = "";
let numerosEnDisplay = "";
let modo = "";
let borrarDisplay = false;

const operar = (num1, num2, operador) => {
    switch(operador){
        case "+": 
            return num1 + num2;
        case "-": 
            return num1 - num2;
        case "x": 
            return num1 * num2;
        case "/": 
            if(num2 == 0){
                return "ERR"
            }
            return num1 / num2;
        default:
            console.log('Operacion no permitida, espere la siguiente actualización!');
    }
}

const cargarDisplay = (value) => {
    if(borrarDisplay){
        numerosEnDisplay = value
        borrarDisplay = false
    } else {
        numerosEnDisplay += value
    }
    display.innerText = numerosEnDisplay
}


for(let btn of botonesTeclado){
    btn.addEventListener("click", ()=>{
        cargarDisplay(btn.value)
        operaciones += btn.value;
        displayOperaciones.innerText = operaciones;
    })
}

for(let btn of botonesOperaciones){
    btn.addEventListener("click", ()=>{
        if(igualPresionado){
            concat = true;
        }
        else if(!concat){
            concat = true;
            operando1 = numerosEnDisplay;
        } else {
            let resultado = operar(Number(operando1), Number(numerosEnDisplay), modo)
            console.log("resultado = " + resultado);
            operando1 = resultado
            if(resultado == "ERR"){
                operando1 = ""
                numerosEnDisplay = ""
                modo = ""
            }
        }
        modo = btn.innerText;
        borrarDisplay = true
        operaciones += modo
        displayOperaciones.innerText = operaciones;
    })
}


borrar.addEventListener("click", ()=>{
    concat = false;
    igualPresionado = false;
    operando1 = ""
    numerosEnDisplay = ""
    modo = ""

    display.innerText = numerosEnDisplay
})

botonIgual.addEventListener("click", ()=>{
    console.log(concat);
    if(concat){
        let resultado = operar(Number(operando1), Number(numerosEnDisplay), modo)
        display.innerText = resultado
        acumulado = true;
        operando1 = resultado
        borrarDisplay = true;
        if(resultado == "ERR"){
            operando1 = ""
            numerosEnDisplay = ""
            modo = ""
        }
        concat = false;
        igualPresionado = true;
    }
})


