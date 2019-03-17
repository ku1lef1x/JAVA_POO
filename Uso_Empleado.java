/*Algunos programadores obvian la modularizacion y realizan en un mismo codigo fuente todo el programa
 * 
 * Veremos ahora un ejemplo de este tipo con un ejemplo con un objeto Empleado, el cual tendra su nombre, fecha de alta, sueldo.... 

 * Cuando realizamos todo el programa en el mismo codigo fuente debemos tener en cuenta que el nombre del fichero sera el mismo nombre que vaya en la clase del
 * main, es decir, la clase principal
 * 
 * Tambien debemos tener en cuenta que cuando tengamos varias clases en un mismo fichero, solo una puede ser publica y solo una contendra el metodo main, que sera
 * esta clase publica*/


package pooII;

import java.util.*;						//paquete para usar clase Date

public class Uso_Empleado {
	
	public static void main(String[] args) {
		
		//PRIMERA ALTERNATIVA
		
		/*Empleado empleado1 = new Empleado("Jesús David", 85000, 2000, 5, 27);			//a diferencia de las instancias vistas anteriormente, hay que pasar parametros
		Empleado empleado2 = new Empleado("Alba Kui", 95000, 2010, 6, 23);
		Empleado empleado3 = new Empleado("Vulpix Tonti", 105000, 2002, 3, 27);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre()+ ". Sueldo: "
				+ empleado1.dameSueldo() + ". Fecha de alta: " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre()+ ". Sueldo: "
				+ empleado2.dameSueldo() + ". Fecha de alta: " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre()+ ". Sueldo: "
				+ empleado3.dameSueldo() + ". Fecha de alta: " + empleado3.dameFechaContrato());*/
		
		//SEGUNDA ALTERNATIVA CON ARRAYS
		
		Empleado [] misEmpleados = new Empleado [3];						//al igual que cualquier array, pero de tipo Empleado
		
		misEmpleados[0] = new Empleado("Jesús David", 85000, 2000, 5, 27);	//cada posicion del array almacena a cada empleado
		
		misEmpleados[1] = new Empleado("Alba Kui", 95000, 2010, 6, 23);
		
		misEmpleados[2] = new Empleado("Vulpix Tonti", 105000, 2002, 3, 27);
		
		//subimos el sueldo
		
		/*for (int i=0; i<misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for (Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		
		//mostramos datos
		
		/*for (int i=0; i<misEmpleados.length;i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + 
					". Sueldo: " + misEmpleados[i].dameSueldo() +
					". Fecha alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		for(Empleado e:misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + 
					". Sueldo: " + e.dameSueldo() +
					". Fecha alta: " + e.dameFechaContrato());
		}
		
		
		
		
		
	}

}


//construimos clase para el objeto constructo


class Empleado {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		//para crear la fecha usaremos la clase GregorianCalendar perteneciente a Date
		//Enero se cuenta como el mes 0
		//miramos como es el constructor en la API
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato=calendario.getTime();
			
		
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
	
	private String nombre;
	private double sueldo;
	private int agno;
	private Date altaContrato;						//Date es una clase, al igual que String. Debemos importar el paquete  
	
	
}
