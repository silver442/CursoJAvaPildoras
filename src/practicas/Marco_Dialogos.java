package practicas;

import java.awt.*;

import javax.swing.*;

public class Marco_Dialogos extends JFrame {

	public Marco_Dialogos() {
		
		setTitle("Prueba de diálogos");
		
		setBounds(500,300,600,450);
		
		JPanel lamina_cuadricula=new JPanel();
		
		lamina_cuadricula.setLayout(new GridLayout(2,3));
		
		String primero[]= {"Mensaje", "Confirmar", "Opción", "Entrada"};

		lamina_tipo=new Lamina_Botones("Tipo", primero);
		
		lamina_cuadricula.add(lamina_tipo);
		
		add(lamina_cuadricula);
		
	}	
	
	private Lamina_Botones lamina_tipo;
}
