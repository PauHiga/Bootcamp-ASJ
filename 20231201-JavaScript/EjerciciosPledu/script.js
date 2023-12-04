// --------------------------HELPERS---------------------------------------------

const getANumber = (message) => {
    while(true){
        let textCaracteres = prompt(message)    
        if (!isNaN(textCaracteres) && textCaracteres.trim() != ''){
            return textCaracteres;
        } else {
            alert('Ingrese un número válido');
        }
    }
}

//----------------------------------------------------------------------------------

// Cantidad de caracteres
// Pedile al usuario que ingrese un texto breve. Guardá su input.
// Mostrá por consola cuántos caracteres tiene el input.

const cantidadCaracteres = (texto) => {
    return texto.length
} 

let textCaracteres = prompt("Ingrese un texto")
const caracteres = cantidadCaracteres(textCaracteres);

alert(`Cantidad caracteres: ${caracteres}`)

// -----------------------------------------------------------------------
// Caluladora de edad
// Preguntale al usuario su edad.
// Calculá cuántos días representa. Por ejemplo: Si tiene 28 años, serán 10.220 días.
// 👩‍🏫👨‍🏫 Para este ejercicio, considerá que un año tiene 365 días. No consideres el año bisiesto.
// Mostrá la respuesta al usuario.

const calculadoraEdad = (texto) => {
    resultado = texto*365;
    return resultado;
} 

let textoEdad = getANumber("Ingrese su edad")
const dias = calculadoraEdad(textoEdad);

alert(`Dias de edad: ${dias}`)


// -----------------------------------------------------------------------
// Suma de valores
// Creá 3 Variables:
// num1.
// num2.
// resultado.
// Pedile al usuario que le asigne un valor a num1 y num2. La Variable resultado deberá ser la suma entre num1 y num2.
// Mostrá por consola el valor de resultado.

const num1 = getANumber("Ingrese un número")
const num2 = getANumber("Ingrese un segundo número")

const suma = parseInt(num1) + parseInt(num2);

alert(`La suma de ${num1} y ${num2} es: ${suma}`)

// -----------------------------------------------------------------------
// Calculador de abastecimiento de por vida 1

const edad = 37;
const edadMax = 100;
const papas = "Papas fritas";
const papasPorDia = 20;
const PrecioPorUnidad = 15;

const papasPorVida = (edadMax - edad)*365*papasPorDia;

console.log(`Necesitarás ${papasPorVida} snacks para que te alcancen hasta los ${edadMax} años.`)
console.log(`Y costarán ${papasPorVida * PrecioPorUnidad}`)

// -----------------------------------------------------------------------
// Calculador de abastecimiento de por vida 2

const diasDeViaje = 7
const presupuestoMax = 100000
const comida = 4 * diasDeViaje

console.log(`Podés gastar ${presupuestoMax/comida} en cada comida para que te alcance la plata durante los ${diasDeViaje} días de viaje`)

// -----------------------------------------------------------------------
// Ejercicios ES6 Ejercicio 2

let nombre = "Gabriela"
let profesion = "programadora"

console.log(`${nombre} es ${profesion}`);

// -----------------------------------------------------------------------
// Ejercicios ES6 Ejercicio 1

let precio = parseInt(getANumber("Ingrese el precio"))
let cantidad = parseInt(getANumber("Ingrese la cantidad"))

alert(`Lleva ${cantidad} a ${precio} = debe abonar ${precio*cantidad}`);  



