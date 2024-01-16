package practicas;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArraysMatrices {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
//		Escribe un programa que lea 15 números por teclado y que los almacene en un array. 
//		Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. 
//		El número que se encuentra en la última posición debe pasar a la posición 0. 
//		Finalmente, muestra el contenido del array.
		
//		int[] array15 = new int[15];
//		int[] nuevoArray15 = new int[15];
//		
//		for(int i = 0; i < 15; i++) {
//			System.out.println("Introduzca el número " + (i + 1));
//			array15[i] = inputANumber(scanner);
//		}
//		
//		for(int i = 0; i < 15; i++) {
//			nuevoArray15[14-i] = array15[i];
//		}
//
//		for(int i = 0; i < 15; i++) {
//			System.out.print(nuevoArray15[i] + " ");	
//		}
		
		
//		-----------------------------------------------------------------------------------------
//		-----------------------------------------------------------------------------------------
		
//		Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. 
//		El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. 
//		Utiliza arrays auxiliares si es necesario.		
		
//		int[] randomNumbers = new int[20];
//		int[] randomNumbersOrdered = new int[20];
//
//		int indexEven = -1;
//		int indexOdd = 20;
//		
//		for (int i = 0; i < 20; i++) {
//			randomNumbers[i] = (int) (Math.random() * 100) + 1;
//		}
//	
//		System.out.println("Array inicial: ");
//		for (int i = 0; i < 20; i++) {
//			System.out.print(randomNumbers[i] + " ");
//		}
//		System.out.println("\n");
//		
//		for (int i = 0; i < 20; i++) {
//			if(randomNumbers[i] %2 == 0) {
//				indexEven++;
//				randomNumbersOrdered[indexEven] = randomNumbers[i];
//			} else {
//				indexOdd--;
//				randomNumbersOrdered[indexOdd] = randomNumbers[i];				
//			}
//		}
//		randomNumbers = randomNumbersOrdered;
//
//		System.out.println("Array final: ");
//		for (int i = 0; i < 20; i++) {
//			System.out.print(randomNumbers[i] + " ");
//		}
		
		
		
//		Generar una matriz de 3×3 con números aleatorios sin repetirse.
		
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		
		
		int[][] matriz33 = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int randomNumber;
				do {
					randomNumber = random.nextInt(9) + 1;
				} while (uniqueNumbers.contains(randomNumber));
				uniqueNumbers.add(randomNumber);
				matriz33[i][j] = randomNumber;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz33[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");

		}
		

	}

	
	public static int inputANumber(Scanner scanner) {
		String input;
		int inputNumber;
		while(true) {
			try {
				input = scanner.nextLine();				
				inputNumber = Integer.valueOf(input);
				return inputNumber;
			} catch (Exception e) {
				System.out.println("El valor introducido no es un número. Por favor introduzca un número");
			}
		}
	}
}
