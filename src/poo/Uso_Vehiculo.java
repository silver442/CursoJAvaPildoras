package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche micoche1 = new Coche();
		
		micoche1.establece_Color("Azul");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
	
		mifurgoneta1.establece_Color("Amarillo");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales() + " " +  micoche1.dime_color());

		System.out.println(mifurgoneta1.dime_datos_generales() + " " + mifurgoneta1.dimeDatosFurgoneta());
	}

}
