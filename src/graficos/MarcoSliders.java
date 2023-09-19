package graficos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Sliders mimarco=new Frame_Sliders();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame_Sliders extends JFrame{
	
	public Frame_Sliders() {
		
		setBounds(500,300,550,400);
		
		Lamina_Sliders milamina=new Lamina_Sliders();
		
		setVisible(true);
		
		add(milamina);
	}
}

class Lamina_Sliders extends JPanel{
	
	public Lamina_Sliders(){
		
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		add(rotulo, BorderLayout.CENTER);
		
		control=new JSlider(8,50, 12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaSlider =new JPanel();
		
		laminaSlider.add(control);
		
		add(laminaSlider, BorderLayout.NORTH);
		
		
		
	}
	
	private  class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//contador++;
			//System.out.println("Estas manipulando el deslizante: " + control.getValue());
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		}
		
	}
	
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int contador;
}