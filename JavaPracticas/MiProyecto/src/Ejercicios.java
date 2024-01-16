import java.util.Scanner;

public class Ejercicios {

	

//	public static void main(String[] args) {
//		boolean status = true;
//		String miVar = status ? "Aprobado" :  "Desaprobado";
//		System.out.println(miVar);

//	}
	
//----------------------------------------------------------------------------			
	
// Pedir al usuario que ingrese cuantas notas quiere ingresar.
// Según eso pedir el valor de cada nota (1 al 10)		
// Sacar el promedio. 
// Hacerlo con FOR, WHILE y DO-WHILE	
	
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int sumaNotas = 0;
//		int nota = 0;
//		float promedio = 0;
//
//		int cantidadNotas = checkInputCantidadNotas(scanner);
//
//		for (int i = 1; i <=cantidadNotas; i++ ) {
//			nota = checkInputNotas(scanner, cantidadNotas);		
//			sumaNotas += nota;
//		}
//		
//		if(cantidadNotas>0) {
//		promedio = (float) sumaNotas / cantidadNotas;
//		}
//		
//		System.out.println(promedio);
//	}
//	
//	
//	
//	static int checkInputCantidadNotas(Scanner scanner) {
//		String cantidadNotasString;			
//		int cantidadNotas = -1;
//		do {
//			System.out.println("¿Cuantas notas se ingresarán?");
//			cantidadNotasString = scanner.nextLine();			
//			try {
//				cantidadNotas =  Integer.parseInt(cantidadNotasString);
//			} catch (Exception e) {
//				System.out.println("El valor ingresado es incorrecto. Ingrese un número válido");
//			}
//		}
//		while (cantidadNotas < 0);
//		return cantidadNotas;
//	}
//	
//	
//	static int checkInputNotas(Scanner scanner, int cantidadNotas) {
//		int nota = 0;
//		do {
//			System.out.println("Ingrese la nota");
//			
//			String notaString = scanner.nextLine();			
//			try {
//				nota =  Integer.parseInt(notaString);
//			} catch (Exception e) {
//				System.out.println("El valor ingresado es incorrecto. Ingrese un número válido");
//			}
//		}
//		while (cantidadNotas < 0 || cantidadNotas >11);
//		
//		return nota;

	
//----------------------------------------------------------------------------		
//Crear un programa donde se introduzcan los tres ángulos internos de un triángulo y se determine si el triángulo es válido o no (deben sumar 180).
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Introduzca los ángulos del triángulo");
//
//		int angulo1 = checkAngle(scanner);
//		int angulo2 = checkAngle(scanner);
//		int angulo3 = checkAngle(scanner);
//
//		if(angulo1+angulo2+angulo3 == 180) {
//			System.out.println("El triángulo es válido");
//		} else {
//			System.out.println("El triángulo es inválido");			
//		}
//		
//	}
//	static int checkAngle(Scanner scanner) {
//		int angle = 0;
//		do {
//			System.out.println("Ingrese el ángulo");
//			
//			String input = scanner.nextLine();			
//			try {
//				angle =  Integer.parseInt(input);
//			} catch (Exception e) {
//				System.out.println("El valor ingresado es incorrecto. Ingrese un número válido");
//			}
//		}
//		while (angle < 0 || angle >360);
//		return angle;
//	}
	

//----------------------------------------------------------------------------		
// Crear un programa que determine si un string introducido por un usuario empieza con un número o con una letra.
	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Write something");
//		
//		char firstUserInput = scanner.nextLine().charAt(0);
//		
//		if(Character.isDigit(firstUserInput)) {
//			System.out.println("The user input started with a number");
//		} else if (Character.isLetter(firstUserInput)) {
//			System.out.println("The user input started with a letter");			
//		} else {
//			System.out.println("The user input didn't start with a number or a letter");						
//		};
//	
//	
//	}
	
	
//----------------------------------------------------------------------------		
//	Realizar la suma de todos los números pares entre N y M donde N y M los ingresa un usuario.
	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//
//		int number1 = checkInput(scanner);
//		int number2 = checkInput(scanner);
//		
//		
//		if(number1 <= number2) {
//			printEven(number1, number2);
//		} else {
//			printEven(number2, number1);		
//		}
//	
//	
//	}
//	
//	static int checkInput(Scanner scanner) {
//		int number = 0;
//		while(true) {
//			System.out.println("Ingrese un número");
//			
//			String input = scanner.nextLine();			
//			try {
//				number =  Integer.parseInt(input);
//				break;
//			} catch (Exception e) {
//				System.out.println("El valor ingresado es incorrecto. Ingrese un número válido");
//			}
//		}
//		return number;
//	}
//	
//	static void printEven(int N1, int N2) {
//		for(int i = N1; i <= N2; i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//		}
//	}

	
//----------------------------------------------------------------------------		
//	Crear un programa que determine si un número es perfecto o no, (se dice que un número es perfecto si el número es igual a la suma de sus divisores positivos, excluido él mismo., Ejemplos 6 = 1 + 2 + 3)
	
//	public static void main(String[] args) {
//	
//		Scanner scanner = new Scanner(System.in);
//	
//		int number = checkInputIsNumber(scanner);
//		
//		if (isPerfect(number)) {
//			System.out.println("Es perfecto");
//		} else {
//			System.out.println("No es perfecto");			
//		}
//	}
//
//	static int checkInputIsNumber(Scanner scanner) {
//		int number = 0;
//		while(true) {
//			System.out.println("Ingrese un número");
//			
//			String input = scanner.nextLine();			
//			try {
//				number =  Integer.parseInt(input);
//				break;
//			} catch (Exception e) {
//				System.out.println("El valor ingresado es incorrecto. Ingrese un número válido");
//			}
//		}
//		return number;
//	}	
//
//	static boolean isPerfect(int number) {
//		if(number <= 0) {
//			return false;
//		}
//		
//		int divisorSum = 0;
//		for(int i = 1; i < number; i++) {
//			if(number%i == 0) {
//				divisorSum += i;
//			}
//		}
//		if(divisorSum == number){
//			return true;
//		} else {
//			return false;
//		}
//	}

	
//----------------------------------------------------------------------------		
//	Recrear el siguiente dibujo

//Ej: para input 8
//
//* * * * * * * *
// * * * * * * *
//* * * * * * * *
// * * * * * * *
//* * * * * * * *
// * * * * * * *
//* * * * * * * *
// * * * * * * *

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		int number = checkInputIsNumber(scanner);
		
		int rows = number;
		
		while (rows > 0 ) {
			printStarLineFull(number);
			rows--;
			if(rows == 0) {
				break;
			}
			printStarLineNotFull(number);
			rows--;
		}
		
		
	}

	static int checkInputIsNumber(Scanner scanner) {
		int number = 0;
		while(true) {			
			System.out.println("Ingrese un número positivo");
			String input = scanner.nextLine();			
			try {
				number =  Integer.parseInt(input);
				if(number > 0) {
					break;
				} else {
					System.out.println("El número no era positivo");					
				}
			} catch (Exception e) {
				System.out.println("El valor ingresado es incorrecto. Ingrese un número válido");
			}
		}
		return number;
	}
	
	
	static void printStarLineFull(int number) {
		for(int i = 1; i <= number; i++) {
			System.out.print("*");
			if(i != number) {
				System.out.print(" ");				
			}
		}
		System.out.print("\n");	
	}
	
	static void printStarLineNotFull(int number) {
		for(int i = 1; i < number; i++) {
			System.out.print(" ");	
			System.out.print("*");
		}
		System.out.print("\n");	
	}
	
	
}
