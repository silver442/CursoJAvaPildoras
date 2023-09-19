package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300); //Tamaño de la ventana
		 
		//setLocation(500,300); //Ubicacion de la ventana
		
		setBounds(500,300,550,250); //ubicacion, tamaño
		
		//setResizable(false); //Para no redimensionar la ventana
		
		// setExtendedState(Frame.MAXIMIZED_BOTH); //El marco se abre a pantalla completa, el valor de la constante es 6
	
		setTitle("Mi ventana"); // Pone titulo a la ventana
	}
	
}
