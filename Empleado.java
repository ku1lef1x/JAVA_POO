/*En este paquete veremos un ejemplo de Herencia estructurada. Para que la herencia este bien estructurada las clases hijas deben responder a la siguiente pregunta: ES UN...??
 * 
 * es decir, en el caso anterior de Coche-Furgoneta, Furgoneta era la subclase o clase hija, deberiamos preguntarnos, una furgoneta es un coche? La respuesta seria no, por lo que vemos que no está bien
 * estructurada la herencia. Lo correcto seria crear una clase vehiculo, con un motor, un peso... de la cual heredaran las demas clases coche, furgoneta...
 * 
 * Vemos un ejemplo Empleado bien estructurado:*/

package herenciaII;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	
	String nombre;
	double sueldo;
	Date altaContrato;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {		
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);
		
		nombre = nom;
		sueldo = sue;
		altaContrato=calendario.getTime();		
	}
	
	public Empleado (String nom) {
		
		this(nom, 30000, 2000, 01,01 );
	}
	
	//getter para devolver el nombre
		public String dameNombre () {
			
			return "El nombre del empleado es " + nombre;
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

}
