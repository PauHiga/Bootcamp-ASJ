//4) Crear una clase llamada Persona que siga las siguientes condiciones:
//Atributos: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. Pueden añadir algún atributo si quieren.
//Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto.
//Constructores:
//Un constructor por defecto.
//Un constructor con el nombre, edad y sexo, el resto por defecto.
//Un constructor con todos los atributos como parámetro.
//
//Métodos:
//calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2 en m)). <br>
//Si esta fórmula es menor que 20, la función devuelve un -1, si el resultado es un número entre 20 y 25 (incluidos),significa que esta por debajo de su peso ideal y la función devuelve un 0, y si el resultado es mayor que 25 significa que tiene sobrepeso y la función devuelve un 1.
//  
//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
//toString(): devuelve toda la información del objeto.
//generaDNI(): genera un número aleatorio de 8 cifras. Este método sera invocado cuando se construya el objeto.
// 
//Crea una clase ejecutable que haga lo siguiente:
//Crea 3 objetos: el primer objeto obtendrá los datos pedidas por teclado (nombre edad, sexo, peso y altura), el segundo objeto obtendrá por teclado todos los datos anteriores menos el peso y la altura, y el último por defecto.
//Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.

package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaEjecutable {

	public static void main(String[] args) {

		List<Persona> listaDePersonas = new ArrayList<Persona>();
		
		Scanner scanner = new Scanner(System.in);
		
		Persona persona1 = personaConDatosBasicos(scanner);
		
		System.out.println("Introduzca peso (en kg):");
		persona1.setPeso(Double.valueOf(scanner.nextLine()));
		
		System.out.println("Introduzca altura (en metros):");
		persona1.setAltura(Double.valueOf(scanner.nextLine()));
		
		listaDePersonas.add(persona1);
		
		Persona persona2 = personaConDatosBasicos(scanner);
		listaDePersonas.add(persona2);

		Persona persona3 = new Persona();
		listaDePersonas.add(persona3);

		for(Persona persona:listaDePersonas) {
			
			System.out.println(persona.toString());
			
			int informeImc = persona.calcularIMC();
			switch (informeImc) {
				case -1:
					System.out.println("Peso bajo");
					break;
				case 0:
					System.out.println("Peso ideal");
					break;
				case 1:
					System.out.println("Sobrepeso");
					break;
				default:
					System.out.println("No hay datos suficientes para el cálculo");
			}
			
			if(persona.esMayorDeEdad()) {
				System.out.println("Es mayor de edad");
			} else {
				System.out.println("Es menor de edad");
			}
			
			System.out.println("\n");
		}
		
	}
	
	public static Persona personaConDatosBasicos(Scanner scanner) {

		Persona persona = new Persona();
		
		System.out.println("Introduzca nombre:");
		persona.setNombre(scanner.nextLine());
		
		System.out.println("Introduzca edad:");
		persona.setEdad(Integer.valueOf(scanner.nextLine()));

		System.out.println("Introduzca sexo: H o M");
		persona.setSexo(scanner.nextLine());

		return persona;
	}


}
