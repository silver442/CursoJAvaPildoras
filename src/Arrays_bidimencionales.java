public class Arrays_bidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Matriz de dos dimenciones*/
		int [][] matrix = {
				{10,5},
				{10,15}
		};
		
		/*Utilizando For each para recorrer la matriz*/
		
		for (int[]fila:matrix) {
			System.out.println();
			
			for (int z:fila) {
				System.out.print(z +" ");
			}
		}
		
		/*for (int i=0;i<2;i++) {
			
			for (int j=0;j<2;j++) {
				
				System.out.print( matrix[i][j] +" ");
			}
			
			System.out.println();
		}*/

	}

}
