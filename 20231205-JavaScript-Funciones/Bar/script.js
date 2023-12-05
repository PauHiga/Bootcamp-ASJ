const opcionesMozo = () => {
    let chisteUno = true;
    let mozoBot = true;
    
    const pedido = (producto, precio) => {
        cuenta += precio;
        alert(`Pidió ${producto}. La cuenta actual es: ${cuenta}`)
    }
    
    const chiste = () => {
        if(chisteUno){
            alert("- Camarero, ¡hay una mosca en mi sopa!\n- No se preocupe, señor, la araña que está en su pan se ocupará de ella.")
            chisteUno = false;
        } else {
            alert("Un señor va a un bar y le dice al camarero: -Un café solo por favor. \nY el camarero dice: -¡Todo el mundo fuera!")
        }
    }
    

    let input = prompt("Bienvenido! Que desea pedir hoy? Seleccione la opción \n1- Un cafe - $100\n2- Un tostado - $200 \n3- Una porción de torta $300\n\n4- Contame un chiste\n\n0- Salir")

    while(mozoBot){
        switch(input){
            case "1":
                pedido("un cafe", 100)
                break;
            case "2":
                pedido("un tostado", 200)
                break;
            case "3":
                pedido("una porción de torta", 300)
                break;
            case "4":
                chiste()
                break;
            case "0":
                mozoBot = false;
                break;
            default:
                alert("Por favor elija una opción válida")
    
        };
        if(mozoBot){
            input = prompt("Desea pedir algo más? Seleccione la opción \n1- Un cafe - $100\n2- Un tostado - $200 \n3- Una porción de torta $300\n\n4- Contame un chiste\n\n0- Pedir la cuenta")
        }
    }
}


const propina = () =>{
    if(input == 0){
        let propina = confirm(`La cuenta es: ${cuenta}. Desea agregar propina?`)
        if(propina){      
            let propinaPorcentaje = prompt("Que porcentaje desea dejar como propina?")
            while(isNaN(Number(propinaPorcentaje)) || Number(propinaPorcentaje)<0){
                propinaPorcentaje = prompt("Por favor introduzca un número válido!")
            }
            cuenta = cuenta + cuenta*propinaPorcentaje/100;
        } 
        alert(`El total a pagar es: ${cuenta.toFixed(2)}. Que tenga un buen dia!`)
    } else {
        alert("Que tenga un buen dia!")
    }
}


//----------------------------------------------------------------------------

let cuenta = 0;

opcionesMozo();
propina();


