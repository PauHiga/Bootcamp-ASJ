//Cifrado Cesar
//Crear un programa que codifique el texto ingresado por el usuario, utilizando el cifrado de Cesar. 
//Los carácteres no-alfabéticos no son transformados.
//
//El Cifrado de Caesar es uno de los métodos de codificación conocidos más antiguos. 
//Es muy simple, sólo se cambian las posiciones del alfabeto. 
//La transformación se denomina ROTn, donde "n" es el valor de cambio de posiciones y ROT significa "ROTAR", 
//porque es un cambio cíclico.
//
//Por ejemplo, ROT2 significa que "a" se vuelve "c", "b" se vuelve "d" y al final "y" se vuelve "a", y "z" se vuelve "b". 
//La cantidad de transformaciones posibles depende de la longitud del alfabeto. Para Español sólo llega a 27.

package practicas;

import java.util.Scanner;

public class CifradoCesar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char[] cypher = new char[27];
		
		for(int i=0; i<27; i++){
			if(i < 14) {
				char letter = (char) ('A' + i);
				cypher[i] = letter;
			} else if(i > 14) {
				char letter = (char) ('A' + i - 1);
				cypher[i] = letter;
			} else {
				cypher[i] = 'Ñ';
			}
		}
		
		while(true) {
			System.out.println("Ingrese el texto a cifrar, o 0 para terminar");
			
			String userInput = scanner.nextLine();
			
			if(userInput.equals("0")) {
				break;
			}
			cifrar(userInput, cypher);
		}
		
		scanner.close();

	}
	
	
	public static void cifrar(String userInputString, char[] cypher) {
		
		StringBuilder userInput = new StringBuilder(userInputString);
		for(int i = 0; i < userInput.length(); i++) {
			char currentChar = userInput.charAt(i);
			char uppercaseChar = Character.toUpperCase(currentChar);
			if(((int) uppercaseChar >=65 && (int) uppercaseChar <=90) || (int) uppercaseChar == 165) {
				
				for(int j = 0; j<27; j++) {
				if(cypher[j] == uppercaseChar) {
					if(j+2 >=27) {
						uppercaseChar = (char) cypher[j+2-27];
						break;
					} else {
						uppercaseChar = (char) cypher[j+2];		
						break;
					}
				}
			}
				
			}	
			userInput.setCharAt(i, uppercaseChar);
		}
		System.out.println(userInput.toString());
	}		
		
}