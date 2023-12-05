let boton1 =  document.getElementById("boton1")
let boton2 =  document.getElementById("boton2")
let boton3 =  document.getElementById("boton3")
let boton4 =  document.getElementById("boton4")
let boton5 =  document.getElementById("boton5")
let boton6 =  document.getElementById("boton6")
let boton7 =  document.getElementById("boton7")
let boton8 =  document.getElementById("boton8")
let boton9 =  document.getElementById("boton9")
let boton0 =  document.getElementById("boton0")

let botonIgual =  document.getElementById("botonigual")

let suma =  document.getElementById("botonsuma")
let resta =  document.getElementById("botonresta")
let mul =  document.getElementById("botonmul")
let div =  document.getElementById("botondiv")

let borrar =  document.getElementById("botonborrar")

let display =  document.getElementById("display")

let operando1 = ""
let numerosEnDisplay = ""
let modo = ""


let borrarDisplay = false;

const operar = (num1, num2, operador) => {
    switch(operador){
        case "suma": 
            return num1 + num2;
        case "resta": 
            return num1 - num2;
        case "mul": 
            return num1 * num2;
        case "div": 
            if(num2 == 0){
                return "ERR"
            }
            return num1 / num2;
    }
}

const cargarDisplay = (value) => {
    if(borrarDisplay){
        if(operando1==""){
            operando1 = numerosEnDisplay
        }
        operando1 = numerosEnDisplay
        numerosEnDisplay = value
        borrarDisplay = false
    } else {
        numerosEnDisplay += value
    }
    display.innerText = numerosEnDisplay
}

const calcularResultado = () => {
    console.log("operando1", operando1);
    console.log("numerosEnDisplay", numerosEnDisplay);

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
}

boton1.addEventListener("click", ()=>{
        cargarDisplay(boton1.value)
})

boton2.addEventListener("click", ()=>{
    cargarDisplay(boton2.value)
})

boton3.addEventListener("click", ()=>{
    cargarDisplay(boton3.value)
})

boton4.addEventListener("click", ()=>{
    cargarDisplay(boton4.value)
})

boton5.addEventListener("click", ()=>{
    cargarDisplay(boton5.value)
})

boton6.addEventListener("click", ()=>{
    cargarDisplay(boton6.value)
})

boton7.addEventListener("click", ()=>{
    cargarDisplay(boton7.value)
})

boton8.addEventListener("click", ()=>{
    cargarDisplay(boton8.value)
})

boton9.addEventListener("click", ()=>{
    cargarDisplay(boton9.value)
})

boton0.addEventListener("click", ()=>{
    cargarDisplay(boton0.value)
})

borrar.addEventListener("click", ()=>{
    operando1 = ""
    numerosEnDisplay = ""
    modo = ""

    display.innerText = numerosEnDisplay
})

botonIgual.addEventListener("click", ()=>{
    if(modo != ""){
        calcularResultado()
    }
})


suma.addEventListener("click", ()=>{
    modo = "suma"
        if(operando1 != ""){
            calcularResultado()
        }
    borrarDisplay = true
})

resta.addEventListener("click", ()=>{
    modo = "resta"
    if(operando1 != ""){
        calcularResultado()
    }
    borrarDisplay = true
})

mul.addEventListener("click", ()=>{
    modo = "mul"
    if(operando1 != ""){
        calcularResultado()
    }
    borrarDisplay = true
})

div.addEventListener("click", ()=>{
    modo = "div"
    if(operando1 != ""){
        calcularResultado()
    }
    borrarDisplay = true
})



