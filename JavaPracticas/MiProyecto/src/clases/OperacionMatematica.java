package clases;

public class OperacionMatematica {
	private double num1;
	private double num2;
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double suma() {
		return this.num1 + this.num2;
	}
	public double resta() {
		return this.num1 - this.num2;
	}
	public double mul() {
		return this.num1 * this.num2;
	}
	public double div() {
		if(this.num2 != 0) {
			return this.num1 / this.num2;			
		} 
		else {
			throw new ArithmeticException("No se puede realizar la división porque el denominador no puede ser cero");
		}
	}
}
