import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] matriz_aleatorios=new int[150];
		
		/*Bucle que genera numeros aleatorios para rellenar la matriz*/
		for (int i=0; i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
			
		}
		
		/*Bucle que recorre la matriz*/
		
		for(int imprime:matriz_aleatorios) {
			
			System.out.println("numeros impresos: " + imprime);
			
		}
	
		
		
	/*Programa que pide al usuario rellenar la matriz*/	
	/*	String [] paises = new String[8];

		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce País " + (i+1));
		}*/
		
		/*
		paises[0]="España";
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		*/
		
	//	for(String elemento:paises) {
	//		System.out.println("Pais: " + elemento);
	//	}
	}

}
