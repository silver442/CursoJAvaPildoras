package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.*;
import javax.swing.JPanel;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame_Spinner mimarco=new Frame_Spinner();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame_Spinner extends JFrame{
	
	public Frame_Spinner() {
		
		setBounds(500,300,550,400);
		
		LaminaSpinner milamina=new LaminaSpinner();
		
		setVisible(true);
		
		add(milamina);
	}
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		//String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				
				return super.getPreviousValue();
				
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
				
			}
			
		});
		
		Dimension d=new Dimension(120,20);
		
		control.setPreferredSize(d);
		
		add(control);
	}
	
	/*private class MiModeloJspinner extends SpinnerNumberModel{
	
		public MiModeloJspinner() {
			
			super(5,0,10,1);
			
		}
		
		public Object getNextValue() {
			
			return super.getPreviousValue();
			
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
			
		}
		
	}*/
	
}