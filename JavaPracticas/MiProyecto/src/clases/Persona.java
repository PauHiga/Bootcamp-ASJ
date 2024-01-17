package clases;

import java.util.Random;

public class Persona {
	
	private String nombre = "";
	private int edad = 0;
	private String DNI;
	private double peso = 0;
	private String sexo = "H";
	private double altura = 0;
	private String colorPelo = "";
	
	public Persona() {
		this.DNI = this.generarDNI();		
	}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = this.generarDNI();
		this.sexo = comprobarSexo(sexo);
	}
	
	public Persona(String nombre, int edad, String dni, double peso, String sexo, double altura, String colorPelo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = this.generarDNI();
		this.peso = peso;
		this.sexo = comprobarSexo(sexo);
		this.altura = altura;
		this.colorPelo = colorPelo;
	}

	public int calcularIMC() {
		if(this.peso ==0 || this.altura == 0) {
			return -99;
		}
		double imc = this.peso / Math.pow(this.altura, 2); 
		if(imc<20) {
			return -1;
		} else if (imc>25) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			return true;
		}
		return false;
	}
	
	private String comprobarSexo(String input) {
		if(input != "M" && input != "H") {
			return "H";
		}
		return input;
	}
	
	@Override
	public String toString(){
		return "Nombre: " + this.nombre + " - Edad: " + this.edad + " - DNI: " + this.DNI + " - Sexo: " + this.sexo + " - Peso: " + this.peso + " - Altura: " + this.altura + " - Color de pelo: " + this.colorPelo;
	}
	
	private String generarDNI() {
		Random random = new Random();
		return String.valueOf(random.nextInt(40000000)+10000000);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	
}
