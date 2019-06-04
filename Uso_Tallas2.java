package paquete_cosas_sueltas;

import java.util.Scanner;

public class Uso_Tallas2 {

	enum Tallas{
		
		//enumerado
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		//atributos
		private String abreviatura;
		
		//constructor
		private Tallas (String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		//metodo getter que proporcione la abreviatura		
		public String dameAbreviatura() {
			
			return abreviatura;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada = sc.next().toUpperCase();  //pasamos a may los que el usuario introduzca en consola
		
		
		//usaremos el metodo valueof que permite devolver el nombre de la constante enumerada 		
		Tallas la_talla = Enum.valueOf(Tallas.class, entrada);
		
		
		System.out.println("Talla= " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
		
		
	}

}
