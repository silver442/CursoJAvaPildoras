package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen mimarco=new MarcoImagen();
		
		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen(){
		
		setTitle("Marco con imagen");
		
		setBounds(750,300,500,400);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);

	}
	
	
}


class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
		try {
			imagen= ImageIO.read(new File("src/graficos/bola.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("La imagen no se encuentra");
		}
		
	}
	
	public void paintComponent( Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen= new File("src/graficos/coche.png");
		
		int anchuraImagen=imagen.getWidth(this);
		
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
	
		for(int i =0;i<400;i++) {
			
			for(int j=0;j<400;j++) {
			
				if(i+j>0) {
					g.copyArea(0, 0, anchuraImagen, alturaImagen, (i*anchuraImagen), j*alturaImagen);
				}
				
			}
		}
		
		//g.copyArea(0,0,50,50,150,75);)
	}
	
	private Image imagen; 
}
