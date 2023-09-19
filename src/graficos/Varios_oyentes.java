package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal marco= new MarcoPrincipal();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
	}

}

class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal() {
		
		setTitle("Prueba Varios");
		
		setBounds(1300,100,300,200);
		
		Lamina_Principal lamina= new Lamina_Principal();
		
		add(lamina);
	}
}

class Lamina_Principal extends JPanel{

	public Lamina_Principal() {
		
		JButton boton_nuevo=new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar todo");
		
		add(boton_cerrar);
	
		OyenteNuevo miOyente=new OyenteNuevo();
		
		boton_nuevo.addActionListener(miOyente);
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marco=new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
		}
		
	}
	
		JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton boton_de_principal) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300,150);
		
		CierraTodos  oyenteCerrar=new CierraTodos();
	
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			dispose();
		}
		
	}
	
	private static int contador=0;
}