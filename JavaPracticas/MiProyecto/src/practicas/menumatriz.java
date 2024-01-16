//		Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos piden hacer un menú con estas opciones:
//
//			Rellenar TODA la matriz de números, debes pedírselo al usuario.
//			Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
//			Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
//			Sumar la diagonal principal (ver ejemplo)
//			Sumar la diagonal inversa (ver ejemplo)
//			La media de todos los valores de la matriz
//
//			IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar. 
//		    Mostrar un mensaje donde diga que debes rellenar la matriz		

package practicas;

import java.util.Random;
import java.util.Scanner;

public class menumatriz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matriz44 = new int[4][4];
		boolean menuActive =  true;
		boolean matrixEmpty =  true;
		int userOption;
		
		while(menuActive) {
			System.out.println("-------------- Menu -------------- ");
			System.out.println("1 - Rellenar matriz");
			System.out.println("2 - Sumar columna");
			System.out.println("3 - Sumar fila");
			System.out.println("4 - Sumar diagonal principal");
			System.out.println("5 - Sumar diagonal inversa");
			System.out.println("6 - Media de todos los valores");
			System.out.println("7 - Salir");						
			System.out.println("\nSeleccione una opción del 1 al 7");						

			while(true) {
				userOption = inputANumber(scanner);
				if(userOption>=1 && userOption<=7) {
					break;
				}
				System.out.println("La opción seleccionada no es válida. Escoja una opción del 1 al 7");
			}
			
			if(userOption != 1 && matrixEmpty) {
				System.out.println("Se debe rellenar la matriz primero. Use la opción 1\n");
			} else {
		
				switch(userOption) {
					case 1:
						matriz44 = rellenar(scanner, matriz44);
						matrixEmpty =  false;
						break;
					case 2:
						sumarColumna(scanner, matriz44);
						break;
					case 3:
						sumarFila(scanner, matriz44);
						break;
					case 4:
						sumarDiagonal(matriz44);
						break;
					case 5:
						sumarDiagonalInversa(matriz44);
						break;
					case 6:
						media(matriz44);
						break;
					case 7:
						menuActive = false;
						break;
				}
			}
		}
		System.out.println("Programa finalizado");
	}
	
	public static int inputANumber(Scanner scanner) {
		String input;
		int inputNumber;
		while (true) {
			try {
				input = scanner.nextLine();
				inputNumber = Integer.valueOf(input);
				return inputNumber;
			} catch (Exception e) {
				System.out.println("El valor introducido no es un número. Por favor introduzca un número");
			}
		}
	}
	
	public static int[][] rellenar(Scanner scanner, int[][] matriz44) {
		System.out.println("Elegi una opcion:");
		System.out.println("1- Rellenar manual (defecto)");
		System.out.println("2- Relleno automático");

		String opcion = scanner.nextLine();
		
		if(opcion.equals("2")) {
			Random random = new Random();
			for(int i = 0; i<4; i++) {				
				for(int j = 0; j<4; j++) {
					matriz44[i][j] = random.nextInt(16) + 1;
				}
			}
		} else {	
			for(int i = 0; i<4; i++) {				
				for(int j = 0; j<4; j++) {
					System.out.println("Ingrese un número (" + ((i*4)+(j+1)) + "/16)");
					matriz44[i][j] = inputANumber(scanner);
				}
			}
		}

		System.out.println("\nMatriz obtenida: ");	
		printMatrix(matriz44);
		
		return matriz44;
	}

	public static void printMatrix(int[][] matriz44) {
		for(int i = 0; i<4; i++) {				
			for(int j = 0; j<4; j++) {
				System.out.print(matriz44[i][j]);
				System.out.print(" ");					
				if(matriz44[i][j] < 10) {
					System.out.print(" ");					
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void sumarColumna(Scanner scanner, int[][] matriz44) {

		System.out.println("\nMatriz: ");		
		printMatrix(matriz44);
		
		int columnaASumar;
		while(true) {
			System.out.println("Seleccione columna a sumar: número de 1 a 4");
			columnaASumar = inputANumber(scanner);
			if(columnaASumar>0 && columnaASumar <5) {
				break;
			}
			System.out.println("La selección es inválida");			
		}

		int suma = 0;
		for(int i = 0; i<4; i++) {
			suma += matriz44[i][columnaASumar-1];
		}
		System.out.println("La suma de la columna " + columnaASumar + " es: " + suma);
	}	

	public static void sumarFila(Scanner scanner, int[][] matriz44) {
		System.out.println("\nMatriz: ");		
		printMatrix(matriz44);
		
		int filaASumar;
		while(true) {
			System.out.println("Seleccione fila a sumar: número de 1 a 4");
			filaASumar = inputANumber(scanner);
			if(filaASumar>0 && filaASumar <5) {
				break;
			}
			System.out.println("La selección es inválida");			
		}

		int suma = 0;
		for(int i = 0; i<4; i++) {
			suma += matriz44[filaASumar-1][i];
		}
		System.out.println("La suma de la fila " + filaASumar + " es: " + suma);
	}		
	
	public static void sumarDiagonal(int[][] matriz44) {
		System.out.println("\nMatriz: ");		
		printMatrix(matriz44);
		
		int suma = 0;
		for(int i = 0; i<4; i++) {
			suma += matriz44[i][i];
		}
		System.out.println("La suma de la diagonal principal es: " + suma);
	}		
	
	public static void sumarDiagonalInversa(int[][] matriz44) {
		System.out.println("\nMatriz: ");		
		printMatrix(matriz44);
		
		int suma = 0;
		for(int i = 0; i<4; i++) {
			suma += matriz44[3-i][i];
		}
		System.out.println("La suma de la diagonal inversa es: " + suma);
	}	
	
	public static void media(int[][] matriz44) {
		System.out.println("\nMatriz: ");		
		printMatrix(matriz44);
		
		int suma = 0;
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				suma += matriz44[i][j];
			}
		}
		System.out.println("La media de los números de la matriz es: " + (double) suma/16);
	}	
	
	
	
}
