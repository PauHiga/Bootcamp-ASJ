package practicas;

import java.util.Scanner;

public class nokia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar cadena de numeros:");
		String input = scanner.nextLine();
		scanner.close();
		
		String output = "";
		
		String [] splitInput = input.split(" ");
		
		String[] num2 = {"a","b","c"};
		String[] num3 = {"d","e","f"};
		String[] num4 = {"g","h","i"};
		String[] num5 = {"j","k","l"};
		String[] num6 = {"m","n","o"};
		String[] num7 = {"p","q","r","s"};
		String[] num8 = {"t","u","v"};
		String[] num9 = {"w","x","y","z"};
		
		for(int x=0;x<splitInput.length;x++) {
			switch(splitInput[x].charAt(0)) {
				case '2':
					output+=num2[((splitInput[x].length()-1)%3)];
					break;
				case '3':
					output+=num3[((splitInput[x].length()-1)%3)];
					break;
				case '4':
					output+=num4[((splitInput[x].length()-1)%3)];
					break;
				case '5':
					output+=num5[((splitInput[x].length()-1)%3)];
					break;
				case '6':
					output+=num6[((splitInput[x].length()-1)%3)];
					break;
				case '7':
					output+=num7[((splitInput[x].length()-1)%4)];
					break;
				case '8':
					output+=num8[((splitInput[x].length()-1)%3)];
					break;
				case '9':
					output+=num9[((splitInput[x].length()-1)%4)];
					break;
				case '0':
					output+=" ";
					break;
			}
		}

		System.out.println("Mensaje decifrado: "+output);
	}

}
