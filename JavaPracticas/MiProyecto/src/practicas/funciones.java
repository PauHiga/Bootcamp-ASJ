package practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class funciones {

	public static void main(String[] args) {
		
		double saldo = 100.00;	
		
		List<String> movimientos = new ArrayList<String>();
		
		Scanner scanner =  new Scanner(System.in);
		boolean exit = true;
		
		while(exit) {
			System.out.println("-------------------------------------------");
			System.out.println("Seleccione una opción");
			System.out.println("-------------------------------------------");
			System.out.println("1 - Extraer");
			System.out.println("2 - Depositar");
			System.out.println("3 - Consultar saldo");
			System.out.println("4 - Ver últimos movimientos");
			System.out.println("5 - Salir");

			System.out.println("-------------------------------------------");

			int selectedOption = getUserInput(scanner);
			double nuevoSaldo;
			
			System.out.println("");

			switch(selectedOption) {
				case 1:
					nuevoSaldo = extraer(scanner, saldo, movimientos);
					saldo = nuevoSaldo;
					break;
				case 2:
					nuevoSaldo = depositar(scanner, saldo, movimientos);
					saldo = nuevoSaldo;
					break;
				case 3:
					consultar(saldo);
					break;
				case 4:
					verMovimientos(movimientos);
					break;
				case 5:
					exit = false;
					break;
			}
			
			System.out.println("");
			
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Gracias por utilizar el servicio");
		System.out.println("Que tenga un buen dia");
		System.out.println("-------------------------------------------");
		
	}
	
	public static int getUserInput(Scanner scanner) {
		String userInput;
		while(true) {
			System.out.println("Introduzca la opción elegida");
			userInput = scanner.nextLine();
			try {
				int userInputNumber = Integer.valueOf(userInput);
				if(userInputNumber >=1 && userInputNumber<=5) {
					return userInputNumber;
				}
				System.out.println("Por favor introduzca un número del 1 al 5");				
			}
			catch (Exception e) {
				System.out.println("Por favor introduzca un número del 1 al 5");								
			}
		}
	}
	
	public static double getUserInputNumber(Scanner scanner) {
		String userInput;
		while(true) {
			System.out.println("Por favor, introduzca el monto");
			userInput = scanner.nextLine();
			try {
				double userInputNumber = Double.valueOf(userInput);
				if(userInputNumber >=0) {
					return userInputNumber;
				}
				System.out.println("El monto debe ser un número positivo");				
			}
			catch (Exception e) {
				System.out.println("El valor introducido es inválido");								
			}
		}
	}
	
	public static double extraer(Scanner scanner, double importeActual, List<String> movimientos) {
		System.out.println("Usted seleccionó: Extraer");
		double importeAExtraer;
		while(true) {
			System.out.println("El monto disponible es: " + importeActual);
			importeAExtraer = getUserInputNumber(scanner);			
			if(importeAExtraer > importeActual) {
				System.out.println("El importe seleccionado supera el monto actual");				
			} else {
				break;
			}
		}
		double total = importeActual - importeAExtraer;
		System.out.println("Se extrajo: " + importeAExtraer);				
		System.out.println("Total en cuenta: " + total);		
		movimientos.add("Extracción - $" + importeAExtraer + " ----- Monto total: $" + total );
		return total;
	}
	
	public static double depositar(Scanner scanner, double importeActual, List<String> movimientos) {
		System.out.println("Usted seleccionó: Depositar");
		System.out.println("El monto actual es: " + importeActual);
		double importeADepositar = getUserInputNumber(scanner);			
		double total = importeActual - importeADepositar;
		System.out.println("Se depositó: " + importeADepositar);				
		System.out.println("Total en cuenta: " + total);				
		movimientos.add("Depósito - $" + importeADepositar + " ----- Monto total: $" + total );
		return total;
	}
	
	public static void consultar(double importeActual) {
		System.out.println("Usted seleccionó: Consultar Saldo");
		System.out.println("El monto actual es: " + importeActual);
	}
	
	public static void verMovimientos(List <String> movimientos) {
		for (String movimiento : movimientos) {
			System.out.println(movimiento);
		}
	}

}
