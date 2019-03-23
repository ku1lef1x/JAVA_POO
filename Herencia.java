/*La Herencia en programacion podemos identificarla con la herencia en la vida real. Consiste en que una clase puede heredar las caracteristicas de otra clase padre, permitiendo asi 
 * la reutilizacion del codigo. 
 * 
 *  En el primer ejemplo que vimos de la clase coche, podemos encontrarnos en la necesidad de crear un objeto furgoneta, por lo que este ultimo objeto heredara las caracteristicas del objeto coche
 *  y, aparte, tendra sus propias caracteristicas. 
 *  
 *  Es decir, si creamos una clase Furgoneta que herede de la clase coche, nos encontramos con que la furgoneta hereda todas las caracteristicas y estado inicial de coche, permitiendonos asi reutilizar 
 *  el codigo y ahorrarnos mucho tiempo.
 *  
 *  Las clases tambien, a parte de las caracteristicas, heredan los metodos.
 *  
 *  La sintaxis para la herencia seria:
 *  
 *  class Nueva_Clase extends Clase_Padre{
 *  		//objeto constructor, estado inicial
 *  		//metodos
 *  		
 *  }*/


package pooII;

public class Herencia {

}


class Coche {

	private int ruedas, largo, ancho, motor, peso_plataforma;

	private String color;
	
	private int peso_total;
	 
	private boolean asientos_cuero, climatizador;
		
		
	public Coche() {
			
	//indicamos su estado inicial
			
	ruedas = 4;
			
	largo = 2000;
			
	ancho = 300;
			
	motor = 1600;
			
	peso_plataforma = 500;
	
}
	
public String dime_largo() {
		
		return "El largo del coche es: " + largo;			//largo es private pero podemos acceder a el porque estamos en su ppia clase
		
	}
	

	//creamos metodo getter para que nos indique las propiedades comunes de nuestro coche
	
	public String dime_datos_generales() {
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" + 
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " kg.";
	}
		

	//metodo getter para conocer color del coche
	//mostrara el color del coche
	
	public String dime_color() {
		
		return "El color del coche es: " + color;
	}
	
	//metodo getter para conocer si tiene asientos de cuero o no
	
	public String dime_asientos() {
		
		if (asientos_cuero == true) {		//aqui no hace falta el this porque no hay lugar a confusion
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	//getter para climatizador
	
	public String dime_climatizador() {
		
		if (climatizador == true) {
			return "El coche tiene climatizado";
		}
		
		else return "El coche tiene aire acondicionado";
	}
	
	//getter para precio del coche
	
	public int precio_coche () {
		
		int precio_final = 10000;
		
		if (asientos_cuero == true) {
			
			precio_final += 2000;
		}
		
		if (climatizador == true) {
			
			precio_final += 1500;
		}
		
		return precio_final;
	}
	
	
	
public void establece_color(String color_coche) {
		
		color = color_coche;
		
	}
	
	//setters para los asientos de cuero
	//la variable de clase se llama asientos_cuero y el argumento o parametro tambien se llama igual
	//para diferenciarlas usamos la variable THIS delante de la variable, asi diferenciamos
	//sintaxis: 		this.variable
	
	public void configura_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("SI") == true) {
			
			this.asientos_cuero = true;
		}else {
			
			this.asientos_cuero = false;
		}
			
	}
	
	//setter para el climatizador
	
	public void configura_climatizador (String climatizador) {
		if(climatizador.equalsIgnoreCase("si")==true) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	//METODO SETTER Y GETTER; PRACTICA NO RECOMENDADA
	//lo usaremos para establecer el peso
	//pueden recibir parametros o no y en funcion de ello 
	//Devolveran un valor u otro
	
	public String dime_peso_coche() {
		
		int peso_carroceria=500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if (asientos_cuero == true) {
			
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	
	
}