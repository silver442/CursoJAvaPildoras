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
		
		lamina_tipo_mensajes=new Lamina_Botones("Tipo de mensaje", new String[] {
				
				"ERROR_MESSAGE",
				"INFORMATION_MENSSAGE",
				"QUESTION_MESSAGE",
				"PLAIN_MESSEGE"
		
		});
		
		lamina_mensaje=new Lamina_Botones("Mensaje", new String[] {
				
				"Cadena",
				"Icono",
				"Componente",
				"Otros",
				"Object[]"
		
		});
		
		lamina_tipo_opcion=new Lamina_Botones("Confirmar", new String[] {
				
				"DEFAULT_OPTION",
				"YES_NO_OPTION",
				"YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"
		
		});
		
		lamina_opciones=new Lamina_Botones("Opción", new String[] {
				
				"String[ ]",
				"Icon[ ]",
				"Object[ ]"
		
		});
		
		lamina_entrada=new Lamina_Botones("Entrada", new String[] {
				
				"Campo de texto",
				"Combo",
		
		});
		
		setLayout(new BorderLayout());
		
		lamina_cuadricula.add(lamina_tipo);
		lamina_cuadricula.add(lamina_tipo_mensajes);
		lamina_cuadricula.add(lamina_mensaje);
		lamina_cuadricula.add(lamina_tipo_opcion);
		lamina_cuadricula.add(lamina_opciones);
		lamina_cuadricula.add(lamina_entrada);
		
		// Construimos la lámina inferior
		
		JPanel lamina_mostrar=new JPanel();
		
		JButton boton_mostrar=new JButton("Mostrar");
		
		lamina_mostrar.add(boton_mostrar);
		
		add(lamina_mostrar, BorderLayout.SOUTH);
		
		add(lamina_cuadricula, BorderLayout.CENTER);
		
	}	
	
	private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensaje, lamina_tipo_opcion, lamina_opciones, lamina_entrada;
}
