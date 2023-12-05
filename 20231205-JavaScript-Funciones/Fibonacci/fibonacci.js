// Fibonacci

// Según un número ingresado por el usuario, mostrar la secuencia de Fibonacci hasta esa cantidad de veces.
// Ej: el usuario ingresa el 8, mostrar:
// 0 1 1 2 3 5 8 13 21 34

// Extras:
// -encapsulado en una funcion
// -retornar la secuencia dentro de un arreglo
// -diferenciar el uso de let y const
// -validar el dato ingresado


const getANumber = () => {
    while(true){
        let input = prompt("Ingrese un número");
        if(!isNaN(Number(input)) && input != "" ){
            return input
        } else {
            alert("Ingrese un número válido")
        }
    }
}

const fibonacci = (input) =>{
    let sequence = [0, 1]
    for(let i = 1; i< input; i++){
        sequence.push(sequence[i-1] + sequence[i])
    }
    return sequence
}

const input =  getANumber();
const result =  fibonacci(input);

alert(`La secuencia es: ${result}\nEl término ${input} es ${result.slice(-1)}`)