/*
 * Los metodos abstractos solo se definen, no se declaran, llevan la siguiente estructura:
 * 
 * 			public abstract String dameDescripcion();
 * 
 * Los metodos abstractos solo pueden ir en clases abstractas:
 * 
 *			abstract class Persona{...}
 * */

/*
 * Las clases que heredan de una clase abstracta que contiene un metodo abstracto deben, OBLIGATORIAMENTE
 * sobreescribir dicho metodo abstracto. 
 * */



package clases_abstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		//array de tipo persona		
		Persona [] las_personas = new Persona [2];
		
		//creamos las dos personas, un empleado y un alumno
		las_personas[0] = new Empleado ("Jesus Muñoz", 60000.00, 2019, 02, 25);		
		las_personas[1] = new Alumno ("Alba", "Enfermeria");
		
		//recorremos con un bucle foreach y mostramos la descripcion.
		for (Persona e:las_personas) {
			
			System.out.println("Nombre: " + e.dameNombre() +". Descripcion: " +
			e.dameDescripcion());
		}
		
	}

}



//creamos la clase abstracta Persona
abstract class Persona{
	
	private String nombre;
	
	//constructor
	public Persona(String nom) {
		
		nombre = nom;
		
		}
	
	//getter para nombre
	public String dameNombre() {
		
		return nombre;
	}
	
	//metodo abstracto, debe ser sobreescrito en las clases que hereden
	public abstract String dameDescripcion(); 
}
	


//creamos clase Empleado, que hereda de persona. 
class Empleado extends Persona{

private double sueldo;
private Date altaContrato;
private int Id;
private static int IdSiguiente=1;		

public Empleado(String nom, double sue, int agno, int mes, int dia) {		
	
	//llamamos a la clase padre, con super, necesario cuando hay herencia. 
	super(nom);	
	GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);	
	altaContrato=calendario.getTime();
	sueldo = sue;	
	++IdSiguiente;		
	Id = IdSiguiente;		
	
}

	//getter para sueldo
	public double dameSueldo() {
		
		return sueldo;
	}
	
	//geter para fecha de alta
	
	public Date dameFechaContrato() {
		
		return altaContrato;
	}
	
	//setter para aumentar el sueldo
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
	//sobreescribimos el metodo abstracto
	
	public String dameDescripcion () {
		
		return "Este empleado tiene tiene un ID = " + Id + 
				" con un sueldo = " + sueldo; 
	}
}


class Alumno extends Persona {
	
	//atributos de Alumno
	private String carrera;
	
	
	//constructor
	public Alumno (String nom, String car) {
		
		super(nom); 	//llamada al constructor de la clase padre Persona
		
		carrera = car;	//Almacenamos el parametro car en la variable carrera
	}
	
	//sobreescribimos el metodo abstracto
	public String dameDescripcion() {
		
		return "Este alumno esta estudiando la carrera de: "  + carrera;
	}
	
}
