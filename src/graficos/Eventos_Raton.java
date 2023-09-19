package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton mimarco=new MarcoRaton();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(700,300,600,400);
	
		EventosDeRaton EventoRaton =new EventosDeRaton();
	
		//addMouseListener(EventoRaton);
	
		addMouseMotionListener(EventoRaton);
	}
}


class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	
		System.out.println("Estás arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Estás moviendo");
	}
	
	
}


/*
class EventosDeRaton extends MouseAdapter{
*/
/*	public void mouseClicked(MouseEvent e) {
		
		//System.out.println("Cordenada X: " + e.getX() + " Cordenada Y: "+ e.getY());
		
		System.out.println(e.getClickCount()); //Cuantos clicks hacemos
	}*/
	
	/*public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("has pulsado el boton izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("has pulsado el boton derecho");
		}
	}
}*/