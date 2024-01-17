package clases;

import java.util.Random;

public class Password {

	int longitud = 8;
	String contraseña;
	
	public Password(String contraseña) {
		this.longitud = contraseña.length();
		this.contraseña = contraseña;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}

	public String generarContraseña(int longitud) {
		Random random = new Random();
		StringBuilder password =  new StringBuilder();
		for(int i = 0; i< longitud; i++) {
			int codigo = random.nextInt(75) + 48;
			password.append((char) codigo);
		}
		return password.toString();
	}
	
	public boolean esFuerte() {
		int cantMayusculas = cuentaChars(this.contraseña, 65, 90);
		int cantMinusculas = cuentaChars(this.contraseña, 97, 122);
		int cantNumeros = cuentaChars(this.contraseña, 48, 57);

		if(cantMayusculas >=2 && cantMinusculas>=1 && cantNumeros>=5) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	private int cuentaChars(String palabra, int minAscii, int maxAscii) {
		int count = 0;
		for(int i=0; i<palabra.length(); i++) {
			if((int) palabra.charAt(i) >= minAscii && (int) palabra.charAt(i) <= maxAscii) {
				count++;
			}
		}
		return count;
	}
	
	public void imprimirFuerte() {
		if(this.esFuerte()) {
			System.out.println("Contraseña fuerte");
		} else {
			System.out.println("Contraseña débil");
		}
	}
	
	
	
}
