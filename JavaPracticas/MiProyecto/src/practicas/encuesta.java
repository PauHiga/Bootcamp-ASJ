//		Queremos realizar una encuesta a 10 personas, en esta encuesta indicaremos 
//		el sexo (1=masculino, 2=femenino), 
//		si trabaja (1=si trabaja, 2= no trabaja) 
//		su sueldo (si tiene un trabajo, sino sera un cero) estará entre 600 y 2000 (valor entero). 
//		Los valores pueden ser generados aleatoriamente. Calcula y muestra lo siguiente:
//
//			Porcentaje de hombres (tengan o no trabajo).
//			Porcentaje de mujeres (tengan o no trabajo).
//			Porcentaje de hombres que trabajan.
//			Porcentaje de mujeres que trabajan.
//			El sueldo promedio de las hombres que trabajan.
//			EL sueldo promedio de las mujeres que trabajan.
//			Usa todos los métodos que veas necesarios, piensa que es aquello que se repite o que puede ser mejor tenerlo por separado.

package practicas;

import java.util.Random;

public class encuesta {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		String[][] encuesta = new String[12][3];
		
		encuesta[0][0] = "Sexo    ";
		encuesta[0][1] = "Trabaja?";
		encuesta[0][2] = "Sueldo  ";

		for(int i = 1; i<11; i++) {
			int sexo = random.nextInt(2);
			if(sexo == 0) {
				encuesta[i][0] = "Hombre  ";
			} else {
				encuesta[i][0] = "Mujer   ";				
			}
			int trabaja = random.nextInt(2);
			if(trabaja == 0) {
				encuesta[i][1] = "No      ";
				encuesta[i][2] = "  -  ";	
			} else {
				encuesta[i][1] = "Si      ";				
				int sueldo = (random.nextInt(15) + 6) * 100;
				encuesta[i][2] = String.valueOf(sueldo);				
			}			
		}

		for(int i = 0; i<11; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(encuesta[i][j]);
			}		
			System.out.println("");
		}
		
		System.out.println("\n");
		
		double porcentajeHombres = sumaCol1("hombre", encuesta)*10;
		System.out.println("\nPorcentaje de hombres totales:" + porcentajeHombres);
		
		double porcentajeMujeres = sumaCol1("mujer", encuesta)*10;
		System.out.println("\nPorcentaje de mujeres totales:" + porcentajeMujeres);
	
		double porcentajeHombresT = sumaCol1Y2("hombre", "Si", encuesta)*10;
		double porcentajeHombresTH = sumaCol1Y2("hombre", "Si", encuesta)*100/sumaCol1("hombre", encuesta);
		
		System.out.println("\nPorcentaje de hombres que trabajan respecto al total:" + porcentajeHombresT);
		System.out.println("Porcentaje de hombres que trabajan respecto a los hombres totales:" + porcentajeHombresTH);
		
		double porcentajeMujeresT = sumaCol1Y2("mujer", "Si", encuesta)*10;
		double porcentajeMujeresTH = sumaCol1Y2("mujer", "Si", encuesta)*100/sumaCol1("mujer", encuesta);
		System.out.println("\nPorcentaje de mujeres que trabajan respecto al total:" + porcentajeMujeresT);
		System.out.println("Porcentaje de mujeres que trabajan respecto a las mujeres totales:" + porcentajeMujeresTH);

		double sueldoPromedioHombre = sumaSueldo("hombre", encuesta)/sumaCol1Y2("hombre", "Si", encuesta);
		System.out.println("\nSueldo promedio hombres:" + sueldoPromedioHombre);
		
		double sueldoPromedioMujeres = sumaSueldo("mujer", encuesta)/sumaCol1Y2("mujer", "Si", encuesta);
		System.out.println("\nSueldo promedio mujeres:" + sueldoPromedioMujeres);
		
	}

	static int sumaCol1(String valorABuscar, String[][] encuesta) {
		int suma = 0;
		for(int i = 0; i<11; i++) {
			if (encuesta[i][0].toLowerCase().contains(valorABuscar.toLowerCase())) {
			    suma++;
			};
		}
		return suma;
	}
	
	static int sumaCol1Y2(String valorABuscar1, String valorABuscar2, String[][] encuesta) {
		int suma = 0;
		for(int i = 0; i<11; i++) {
			if (encuesta[i][0].toLowerCase().contains(valorABuscar1.toLowerCase()) && encuesta[i][1].toLowerCase().contains(valorABuscar2.toLowerCase())) {
				suma++;
			};
		}
		return suma;
	}
	
	static int sumaSueldo(String valorABuscar, String[][] encuesta) {
		int suma = 0;
		for(int i = 0; i<11; i++) {
			if (encuesta[i][0].toLowerCase().contains(valorABuscar.toLowerCase()) && encuesta[i][1].toLowerCase().contains("si")) {
			suma += Integer.valueOf(encuesta[i][2]);
			}
		}
		return suma;
	}
	
}
