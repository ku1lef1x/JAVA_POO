package pooII;

public class Uso_Herencia {

	public static void main(String[] args) {
			
			Coche miCoche1 = new Coche();			
			miCoche1.establece_color("Rojo");
			
			
			
			Furgoneta miFurgoneta1 = new Furgoneta(7, 580);			
			miFurgoneta1.establece_color("Azul");
			miFurgoneta1.configura_asientos("si");
			miFurgoneta1.configura_climatizador("si");
			System.out.println(miFurgoneta1.dime_datos_generales() + "\n"+
					miFurgoneta1.dime_color() + "\n" + 
					miFurgoneta1.dimeDatosFurgoneta());
			System.out.println(miCoche1.dime_datos_generales() + "\n"
					+ miCoche1.dime_color());
			
			
			

	}

}
