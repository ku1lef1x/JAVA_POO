package test_creacion_uso_objetos;

public class Teclado {
	
	private String teclas, switches, material;
	
	private String retroiluminacion_color;
	
	private int precio_final = 20;
	
	public Teclado () {
	
		teclas = "mebrana";		
		switches = "no";
		material = "plastico";	
		
	}
	
	//Establecemos tipo de teclas y mostramos
	
	public void tipo_teclas (String teclas) {
		
		this.teclas = teclas;
	}
	
	public String devuelve_teclas () {
		return "El ordenador tiene un tipo de teclas: " + teclas;
			
	}
	
	public void tipo_switch (String switche) {
		
		this.switches = switche;
	}
	
	public String devuelve_switch () {
		
		return "El teclado tiene un switch de color: " + switches;
	}
	
	public void tipo_material (String material) {
		this.material = material;
	}
	
	public String devuelve_material () {
		return "El material del teclado es " + material;
	}
	
	public int establece_precio(){
		
		if (teclas.equalsIgnoreCase("mecanicas") == true) {
			precio_final = precio_final + 15;
		}
		if (switches.equalsIgnoreCase("azul") == true || switches.equalsIgnoreCase("marron")) {
			precio_final = precio_final + 20;
		}
		if(material.equalsIgnoreCase("metal") == true) {
			precio_final = precio_final + 10;
		}
		
		return precio_final;
	}
	
}
