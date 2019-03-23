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
		
		Empleado [] misEmpleados = new Empleado [4];						//al igual que cualquier array, pero de tipo Empleado
		
		misEmpleados[0] = new Empleado("Jesús David", 85000, 2000, 5, 27);	//cada posicion del array almacena a cada empleado
		
		misEmpleados[1] = new Empleado("Alba Kui", 95000, 2010, 6, 23);
		
		misEmpleados[2] = new Empleado("Vulpix Tonti", 105000, 2002, 3, 27);
		
		misEmpleados[3] = new Empleado("Kuintin");							//solo pasamos un argumento, por tanto se usa el nuevo constructor. Con el getter se mostrara sueldo=0 y fecha = null;
		
		//subimos el sueldo
		
		/*for (int i=0; i<misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		
		//mostramos datos
		
		/*for (int i=0; i<misEmpleados.length;i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + 
					". Sueldo: " + misEmpleados[i].dameSueldo() +
					". Fecha alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		
		//subimos suelo con foreach		
		for (Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}

		//devolvemos informacion con foreach
		for(Empleado e:misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + 
					". Sueldo: " + e.dameSueldo() +
					". Fecha alta: " + e.dameFechaContrato());
		}
		
		
		
		
		
	}

}


//construimos clase para el objeto constructor

/*Como hemos visto, los constructores se diferencia de otros metodos en que siempre su nombre debe coincidir con el nombre de la clase que lo contiene. Ademas, los constructores 
 * no llevan void, ni devuelven ningun tipo de datos. 
 * 
 * La sobrecarga de constructores implica que hay varios constructores con un mismo nombre, Empleado en este caso, pero no pueden recibir el mismo numero de parametros ni el mismo tipo. 
 * 
 * La necesidad de crear varios objetos constructores con el mismo nombre surge cuando necesitamos dar un estado inicial distinto 
 * a cada objeto. Imaginemos que desconocemos el suelo de un empleado pq ha entrado hace 
 * poco y tampoco su fecha de alta. En este caso, no podriamos usar el unico objeto constructor que tenemos, por tanto, hacemos otro metodo constructor en los que pasamos como parametros
 * los datos que conocemos de este nuevo Empleado, en este caso, su nombre.
 * 
 * JAVA sabe que constructor usar en funcion de como hagamos la llamada, si al crear un nuevo empleado, el empleado 3, pasamos un solo parametro (nombre) sabe que estamos llamando al nuevo 
 * constructor gracias a estos argumentos. Si le pasamos 5 argumentos estariamos llamando al primer constructor.
 * 
 * Tambien se puede hacer sobrecarga de metodos del mismo modo, ambos con el mismo nombre pero con distintos numeros de parametros.*/
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
	
	public Empleado(String nom) {							//sobrecarga de constructores: dos constructores con el mismo nombre pero distintos tipos de parametros.
		
		this(nom, 30000, 2000, 01,01);						//con este this estamos llamando al primer constructor. Cada parametro que se le pasa a dicho this, lo envia al 
															//primer constructor, estableciendo el sueldo 30k y la fecha 1-1-00 como por defecto. Si tuvieramos mas constructores,
															//en funcion de los parametros o argumentos que pasemos en el this llamara a uno u otro. 
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
	private Date altaContrato;						//Date es una clase, al igual que String. Debemos importar el paquete  
	
	
}
