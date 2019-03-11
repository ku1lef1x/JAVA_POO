package poo_introduccion;

public class Coche {
	
	//en esta clase irian las caracteristicas comunes de los coches
	//ancho largo en cm, motor en cc, peso en kg
	//hacemos datos private para encapsular y que solo sean accesibles desde esta clase
		
	private int ruedas, largo, ancho, motor, peso_plataforma;
	
	//añadimos nuevos datos
	
	String color;
	
	int peso_total;
	
	boolean asientos_cuero, climatizador;
		
	//creamos el metodo constructor
		
	public Coche() {
			
	//indicamos su estado inicial
			
	ruedas = 4;
			
	largo = 2000;
			
	ancho = 300;
			
	motor = 1600;
			
	peso_plataforma = 500;
	
}
	
	//metodo getter para proporcionar largo del coche
	//si queremos que nos devuelva 2000 sin mas, el tipo de dato seria int, como queremos devolver un mensaje, string
	
	public String dime_largo() {
		
		return "El largo del coche es: " + largo;			//largo es private pero podemos acceder a el porque estamos en su ppia clase
		
	}
	
	
	//metodo setter (modificar valor propiedad)
	//nos modificara el color de nuestro objeto coche a azul (iremos modificando)
	
	public void establece_color() {
		
		color = "azul";
		
	}
	
	//metodo getter para conocer color del coche
	//mostrara el color del coche
	
	public String dime_color() {
		
		return "El color del coche es: " + color;
	}
	
}