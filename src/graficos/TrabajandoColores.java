package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConColor mimarco=new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor(){
		
		setTitle("Prueba con colores");
		
		setSize(400,400);
		
		LaminaConColor milamina=new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window); //Dar color de fondo
	
	
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent( Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		//Dibujo de rectangulo
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.BLUE); //Color del trazo
		g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		//Dibujo elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor=new Color(125,189,200);
		
		g2.setPaint(micolor.brighter()); //hace el trazo de color RGB, brighther aclara el color
		
		g2.fill(elipse); //rellena el fondo
	}
}