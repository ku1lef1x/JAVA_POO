package poo_introduccion;

public class Coche {
	
	//en esta clase irian las caracteristicas comunes de los coches
	//ancho largo en cm, motor en cc, peso en kg
	//hacemos datos private para encapsular y que solo sean accesibles desde esta clase
	//estas caracteristicas serian los atributos
		
	private int ruedas, largo, ancho, motor, peso_plataforma;
	
	//añadimos nuevos atributos o datos que no seran comunes, seran diferentes en cada coche.
	//encapsulamos los datos para que solo sean accesibles con los canales adecuados (setters/getters);
	
	private String color;
	
	private int peso_total;
	 
	private boolean asientos_cuero, climatizador;
		
	//creamos el metodo constructor
		
	public Coche() {
			
	//indicamos su estado inicial
			
	ruedas = 4;
			
	largo = 2000;
			
	ancho = 300;
			
	motor = 1600;
			
	peso_plataforma = 500;
	
}
	
	
	
	//GETTERS
	
	//metodo getter para proporcionar largo del coche
	//si queremos que nos devuelva 2000 sin mas, el tipo de dato seria int, como queremos devolver un mensaje, string
	//nos informa de un valor, el largo
	
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
	
	
	
	
	
	//SETTERS
	
	//metodo setter (modificar valor propiedad)
	//nos modificara el color de nuestro objeto coche a azul (iremos modificando)
	//establece un valor, el color
	//modificamos el setter para elegir nosotros el color con paso por parametros
	
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