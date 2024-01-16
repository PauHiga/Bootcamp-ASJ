
public class Arrays {

//	public static void main(String[] args) {
//		byte arr[] = {1, 2, 3, 4};
//		
//		for (int i= 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//	}
	
	

	
	public static void main(String[] args) {
		//Matriz con tres elementos, de dos elementos cada uno.
		// (Tres filas de dos columnas cada una)
		byte matriz[][] = {{1,2},{2,4},{3,6}};
		
		for (int i= 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]);				
				System.out.print(" ");	
			}
			System.out.print("\n");				
		}

	}	
	

}
