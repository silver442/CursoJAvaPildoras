package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Barra marco=new Marco_Barra();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class Marco_Barra extends JFrame{
	
	public Marco_Barra() {
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		Lamina=new JPanel();
		
		add(Lamina);
		
		// configuracion de acciones
		
		Action accionAmarillo= new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		Action accionAzul= new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.blue);
		Action accionRojo= new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.red);
		
		Action accionSalir=new AbstractAction("Salir", new ImageIcon("src/graficos/Salir.gif")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
				
			}
		};
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionAzul);
		
		menu.add(accionAmarillo);
		
		menu.add(accionRojo);
	
		JMenuBar barra_menu = new JMenuBar();
		
		
		
		barra_menu.add(menu);
		
		setJMenuBar(barra_menu);
		
		//Construccion de la barra de herramientas
		
		JToolBar barra=new JToolBar();
		
		barra.add(accionAzul);
		
		barra.add(accionAmarillo);
		
		barra.add(accionRojo);
		
		barra.addSeparator();
		
		barra.add(accionSalir);
		
		add(barra, BorderLayout.NORTH);
	}

	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color c) {
			
			putValue(Action.NAME, nombre); //Almacenar el nombre en la clave
			
			putValue(Action.SMALL_ICON, icono); //icono:valor
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("color_de_fondo", c);
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c =(Color)getValue("color_de_fondo");
			
			Lamina.setBackground(c);
		}
	}
	
	private JPanel Lamina;
}


