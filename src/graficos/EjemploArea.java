package graficos;

import javax.swing.*;

import java.awt.event.*;
public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoArea mimarco=new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setBounds(500,300,500,350);
		
		LaminaArea milamina=new LaminaArea();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		miarea=new JTextArea(8,20);
		
		JScrollPane laminaBarras=new JScrollPane(miarea);
		
		miarea.setLineWrap(true);
		
		add(laminaBarras);
	
		JButton miboton=new JButton("Dale");
		
		miboton.addActionListener(new GestionaArea());
	
		add(miboton);
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(miarea.getText()); // rescata el texto del area de texto
			
		}
		
	}
	
	private JTextArea miarea;
}