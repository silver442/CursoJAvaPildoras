package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Layout marco= new Marco_Layout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
	}

}

class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		
		setTitle("Prueba Acciones");
		
		setBounds(600,350,600,300);
		
		Panel_Layout lamina= new Panel_Layout();
		
		// FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
		
		Panel_Layout2 lamina2= new Panel_Layout2();
		
		add(lamina, BorderLayout.NORTH);
	
		add(lamina2, BorderLayout.SOUTH);
	}
}

//Creacion de Lamina
class Panel_Layout extends JPanel{
	
	public Panel_Layout() {
		
		//setLayout(new FlowLayout(FlowLayout.LEFT, 75,100));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));

		add(new JButton("Rojo"));
			
	}
}

//Lamina 2
class Panel_Layout2 extends JPanel{
	
	public Panel_Layout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"), BorderLayout.WEST);
		
		add(new JButton("Verder"), BorderLayout.EAST);
		
		add(new JButton("Negro"), BorderLayout.CENTER);
	}
}