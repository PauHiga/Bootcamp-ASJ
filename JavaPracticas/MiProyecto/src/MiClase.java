import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
//		System.out.println("double min value: " + Double.MIN_VALUE);
//		System.out.println("double max value: " + Double.MAX_VALUE);
//		System.out.println("float min value: " + Float.MIN_VALUE);
//		System.out.println("float max value: " + Float.MAX_VALUE);		
//		System.out.println("short min value: " + Short.MIN_VALUE);
//		System.out.println("short max value: " + Short.MAX_VALUE);		
//		System.out.println("Integer min value: " + Integer.MIN_VALUE);
//		System.out.println("Integer max value: " + Integer.MAX_VALUE);
//		System.out.println("long min value: " + Long.MIN_VALUE);
//		System.out.println("long max value: " + Long.MAX_VALUE);
//
//		System.out.println(30/12);
//
//		double c = (double) 30/12;
//		System.out.println(c);
		
//		Dada una palabra ingresada por el usuario, mostrar su equivalente en ASCII letra a letra.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		
		String userInput = scanner.nextLine();
		
		String stringAscii =  "";
		
//		StringBuilder stringAscii = new StringBuilder();
		
//		stringAscii.append(userInput + " --> ");
		
		char currentChar;
		int charInAscii;
		
		for (int i = 0; i<userInput.length(); i++) {
			currentChar = userInput.charAt(i);

			//Conversión as ascii: parseando el char a int
			charInAscii = (int) currentChar;
			
			stringAscii += charInAscii;
			
//			stringAscii.append(charInAscii);
			
			if(i < userInput.length()) {
//				stringAscii.append(" ");				
				stringAscii += " ";

			}
		}	
		System.out.println(stringAscii.toString());
		scanner.close();
	}

}
