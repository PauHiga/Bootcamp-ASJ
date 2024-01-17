package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PracticaClases {

	public static void main(String[] args) {
		
//		1) Cree una clase que me permita realizar una operación matemática de 2 números. (Crear los metodos y atributos necesarios)
		
//		OperacionMatematica operacionMatematica =  new OperacionMatematica();
//		
//		operacionMatematica.setNum1(10);
//		operacionMatematica.setNum2(20);
//		
//		System.out.println(operacionMatematica.suma());

		
		
//	2) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad
//	(puede tener decimales).
//	El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
//
//	Crea sus métodos get, set y toString.
//
//	Tendrá dos métodos especiales:
//	ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
//	introducida es negativa, no se hará nada.
//	retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
//	actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
		
//		Cuenta cuenta =  new Cuenta("Juan", 100);
//		
//		System.out.println(cuenta.toString());
//		
//		cuenta.ingresar(50);
//		
//		System.out.println(cuenta.toString());
//		
//		cuenta.retirar(100);
//		
//		System.out.println(cuenta.toString());
//		
//		cuenta.retirar(100);
//
//		System.out.println(cuenta.toString());
		
		
//		3) Haz una clase llamada Password que siga las siguientes condiciones:
//			Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
//			Un constructor por defecto.
//			Un constructor con la longitud que nosotros le pasemos. Generara una contraseña
//			aleatoria con esa longitud.
//			Los métodos que implementa serán:
//			esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe
//			tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
//			    
//			generarPassword(): genera la contraseña del objeto con la longitud que
//			tenga.
//			   
//			Método get para contraseña y longitud.
//			Método set para longitud.
//
//			Ahora, crea una clase clase ejecutable:
//			Obtener por teclado, contraseñas ingresadas por el usuario (pueden utilizar arrays o ArrayList).
//			Mostrar todas las contraseñas y si son fuertes o no

		
//		List<Password> passwordsList = new ArrayList<Password>();
//		Scanner scanner = new Scanner(System.in);
//			while(true) {
//				System.out.println("Ingrese una contraseña, presione 1 para generar contraseña aleatoria o presione 0 para finalizar");
//				String userInput = scanner.nextLine();
//				if(userInput.equals("0")) {
//					break;
//				}
//				if(userInput.equals("1")) {
//					passwordsList.add(new Password(8));
//				} else {
//					passwordsList.add(new Password(userInput));					
//				}
//			}
//
//		
//		Iterator<Password> iterador = passwordsList.iterator();
//		
//		while(iterador.hasNext()) {
//			Password element = iterador.next();
//			System.out.print(element.getContraseña() + " - ");
//			element.imprimirFuerte();
//		}
			
		
		
		
		
	}
}
