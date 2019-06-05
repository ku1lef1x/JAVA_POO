/* Las INTERFACES son las directrices que debe seguir una clase. Tiene un funcionamiento parecido a 
 * las clases abstractas.
 * 
 * Una clase cualquier puede implementar una interfaz, al implementarla, debe cumplir una serie de directrices
 * (metodos) que vendran dentro de la interfaz. Es decir, la clase que implemente una interfaz debe
 * incluir todos los metodos que tiene dicha interfaz.
 * 
 * 
 * 
 * Las interfaces pueden ser:
 * 		- predefinidas: incluidas en la API de java
 * 		- creadas por el usuario. 
 * 
 * Las interfaces sólo pueden contener métodos abstractos y constantes. Tambien debemos tener en cuenta:
 * 
 * 		1. Al igual que ocurre con las clases, se almacenan en un archivo .class.
 * 		2. No se pueden instanciar.
 * 		3. Todos sus métodos son public y abstract. Sólo se definen, igual que en las clases abstractas
 * 		(si no indicamos q el metodo es publico y abstracto se presupone por defecto).
 * 		4. No tienen variables. Sólo constantes.  
 * 
 * 
 * 
 * ¿Por qué hay necesidad de interfaces si son tan parecidas a las clases abstractas?
 * 
 * Una primera diferencia es que las clases abstractas pueden tener métodos que no sean abstractos, 
 * por su parte las interfaces no, todos sus métodos han de ser abstractos. 
 * 
 * Pero la principal razon por la que existen las interfaces es por la herencia múltiple. Como 
 * ya sabemos JAVA no soporta herencia múltiple, por tanto, para solventar el problema se usan las 
 * interfaces. 
 * 
 * Por ejemplo, en nuestros ficheros, donde Jefatura hereda de Empleado, no podríamos implementar
 * mas métodos abstractos ya que Empleado no es abstracta. Por tanto, si queremos implementar mas 
 * métodos abstractos se realizaría con las interfaces. 
 * La clase jetafura podría implementar varías interfaces sin problema, no existe limite en cuanto
 * numero de interfaces a implementar.
 * 
 * Su sintaxis, en este ejemplo seria:
 * 
 * 			Class Jefatura extends Empleado implements Interfaz1, Interfaz2{};
 * */


/* EJEMPLO DE INTERFACES PREDEFINIDAS EN JAVA */


package interfaces;


import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class Interfaces {
	
public static void main(String[] args) {
		
		//creamos un jefe
		Jefatura jefe1 = new Jefatura ("Alba", 80000, 2000, 2, 19);		
		jefe1.estableceIncentivo(500);		
		
		//creamos array tipo Empleado para ir añadiendo objetos a el
		Empleado [] empleados = new Empleado [3];
		
		//creamos un empleado en la primera posicion del array
		empleados[0] = new Empleado ("Jesús", 80000, 2000, 4, 27);
		
		//creamos un jefe (hereda de empleado) en la segunda posicion del array
		empleados [1] = jefe1;
		
		//recorremos el array para subir el sueldo al jefe con el incentivo establecido anteriormente
		for (int i=1; i<empleados.length; i++) {
			
			System.out.println(empleados[1].dameSueldo());
		}	
		
		/*imaginemos que queremos ordenador el array de tipo Empleado en el que tenemos
		  almacenados nuestros empleados. Para ello necesitariamos el método sort, incluido 
		  en la clase estatica Arrays (por tanto, Arrays.sort()).*/
		  
		  /*Para usar el metodo Arrays.sort en un array de objetos, todos los objetos deben
		  implementar la interfaz predefinida Comparable.*/
		
		
		//primero añadiremos otro objeto mas al array. 		
		empleados[2] = new Empleado ("Dayo", 50000, 2019, 6, 1);
		
		//recorremos el array para mostrar datos de los empleados y fecha de alta		
		for (Empleado e:empleados) {
			
			System.out.println(e.nombre + "\n" + e.dameFechaContrato() + "\n" + e.dameSueldo());
		}
		
		/*indicamos la linea para ordenar el array. Si ejecutamos arroja error
		ya que no hemos implementado la interfaz Comparable*/
		Arrays.sort(empleados);
		
		//ahora implementamos las interfaces comparable. 
		
		System.out.println();
		
		//volvemos a recorrer el array,  ahora ordenado gracias al metodo Sort.		
		for (Empleado e:empleados) {
			
			System.out.println(e.nombre + "\n" + e.dameFechaContrato() + "\n" + e.dameSueldo());
		}
		
		
	}

}

class Empleado implements Comparable{	 //al implementar la interfaz debemos incluir su metodo abstracto
	
	String nombre;
	double sueldo;
	Date altaContrato;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {		
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);
		
		nombre = nom;
		sueldo = sue;
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
		
		
		//creamos el metodo abstracto de la interfaz Comparable compareTo		
		//los ordenaremos por sueldo.
		public int compareTo(Object miObjeto) {
			
			/*convertimos miObjeto en empleado (dentro de otroEmpleado)
			para posteriormente poder comparar*/
			Empleado otroEmpleado = (Empleado) miObjeto;
			
			//si el sueldo de uno, es menor que el suelo de otro, devuelve menos 1
			if(this.sueldo<otroEmpleado.sueldo) {				
				return -1;
				}
			
			//si el sueldo de uno, es mayor que el sueldo de otro, devuelve 1
			if(this.sueldo > otroEmpleado.sueldo) {
				return 1;
				}
			//si ambos sueldos son iguales, devuelve 0
			return 0;
			
			//el metodo sort usará esta función para ordenadar el array. 
		}
}


final class Jefatura extends Empleado{   //indicar final delante de la clase hace que no pueda heredar otra clase de ella
	
	//atributos de Jefatura
	private double incentivo;
	
	
	//creamos objeto constructor jefatura.	
	public Jefatura(String nom, double sueldo, int agno, int mes, int dia) {
		
		super(nom, sueldo, agno, mes, dia);
		
	}
	
	//metodo para establecer el incentivo
	public void estableceIncentivo(double b) {
		
		incentivo = b;		
	}
	
	//metodo para devolver sueldo con incentivo
	public final double dameSueldo() {	
		//este metodo invalida para Jefatura el dameSueldo() de Empleado
		//indicar el metodo final hace que no se pueda sobreescribir mas
		
		double sueldoJefe = super.dameSueldo();		//llamamos a dameSueldo de la clase padre
		
		return sueldoJefe + incentivo;
	}	

}
