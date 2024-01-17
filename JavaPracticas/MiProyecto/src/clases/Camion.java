package clases;

public class Camion extends Automovil{

	private double cargaMax;
	
	public Camion(double cargaMax, int año, String marca, String color) {
		super(año, marca, color);		//<---- LLama al constructor con parámetros del padre
		this.cargaMax = cargaMax;
	}
	
	public void imprimirCamion() {
		super.printAuto();
		System.out.println("Carga max: " + this.cargaMax);
	}

	@Override
	public String toString() {
		String toReturn = super.toString() + "Camion [cargaMax=" + cargaMax + "]";
		return toReturn;
	}
		
	
}
