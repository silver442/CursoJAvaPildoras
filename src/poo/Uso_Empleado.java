package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		Empleado empleado3=new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre" + empleado1.dameNombre() + "Sueldo: "+ empleado1.dameSueldo() + 
				" Fecha alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre" + empleado2.dameNombre() + "Sueldo: "+ empleado2.dameSueldo() + 
				" Fecha alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre" + empleado3.dameNombre() + "Sueldo: "+ empleado3.dameSueldo() + 
				" Fecha alta: " + empleado3.dameFechaContrato());*/
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);

		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados= new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17 );
		
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
		misEmpleados[3] = new Empleado("Antonio Fernández");
		
		misEmpleados[4] = jefe_RRHH; // Polimorfismo en accion. Principio de sustitucion
		
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999,5,26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5]; //Casting para convertir un objeto a otro
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más dias de vacaciones a los empleados"));
	
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " Tiene un bonus de: " + 
				jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		/*for(int i=0; i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*
		for (int i=0; i<3; i++) {
			
			System.out.println("Nombre" + misEmpleados[i].dameNombre() + "Sueldo: "+ misEmpleados[i].dameSueldo() + 
					" Fecha alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e: misEmpleados) {
			
			System.out.println("Nombre " + e.dameNombre() 
					+ " Sueldo: "+ e.dameSueldo() + 
					" Fecha alta: " + e.dameFechaContrato());
			
		}
		
	}

}


class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000,2000,01,01); //this llama al otro constructor
		
	}
	
	public String dameNombre() { //Getter
		
		return nombre + " Id: " + Id;
		
	}
	
	public double dameSueldo() { //Getter
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() { //Getter
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado)miObjeto;
		
		if(this.sueldo<otroEmpleado.Id) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.Id) {
			return 1;
		}
		
		return 0;
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
		
	}
	
	private final String nombre;
	private double sueldo;
	private Date altaContrato;

	private static int IdSiguiente=1;
	private int Id;
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
	
		super(nom, sue, agno, mes, dia);
	
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;
		
	}
	
	public double dameSueldo() { //Metodo que sobreescribe el metodo de la clase empleado
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la decisión: " + decision;
	
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
				
	}
	
	//Campo de clase
	private double incentivo;
	
}


	