/*Crearemos un id para el empleado de manera que cada vez que añadamos uno el sistema le de el siguiente id: id1, id2....
 * Necesitamos que sea Java quien asigne el id, asi evitamos que se nos olvide, poner uno repetido... donde entraria en juego la palabra STATIC.
 * 
 * STATIC: 
 * 
 * 
 * Cuando creamos objetos como Emleado_Satic trabajador1 se crea una copia para ese objeto de la variable nombre, otra copia de la variable seccion y otra de la variable Id.
 * Para que Java sea capaz de ir asignando un orden correlativo a ID necesitamos que cada uno de los objetos no cree una copia de la variable Id, sino que esta variable sea compartida
 * entre todos los objetos. 
 * Ésto se consigue con la palabra reservada o modificador static. Static hace que cada objeto no obtenga una copia de la variable sino que hara que los objetos pertenecientes
 * a la clase compartan dicha variable.
 * 
 * Static hace que una variable pertenezca a la clase, no al objeto. 
 * 
 * 
 * Los metodos tambien pueden ser STATIC, esto hace que el metodo no pertenezca al objeto sino a la clase.  
 * Tiene la peculiaridad que para llamar al metodo debemos hacerlo con el nombre de la clase, no con el objeto, ya que no actuan sobre objetos
 * por ejemplo:
 * sin estatic: alumno1.getNota (objeto.metodo)
 * con static: alumnos.getNota  (clase.metodo)
 * Los metodos static no permiten acceder a los campos de la clase (las variables o constantes private). 
 * Para poder acceder a una variable de clase, esta debe ser tambien static como en nuestro ejemplo IdSiguiente, 
 * la cual es static y es la unica a la que accedemos con el metodo static
 * 
 * Lo vemos en el ejemplo:*/

package pooII;

public class Empleados_Static {
	

	private final String nombre;				
	private String seccion;
	
	private int Id;											//creamos variable id
	private static int IdSiguiente=1;						//idsiguiente. Sino hacemos static, dara siempre el valor 1 ya que no seria una variable compartida  
	
	public Empleados_Static(String nom){					//metodo constructor
		
		nombre = nom;
		
		seccion = "administación";
		
		Id = IdSiguiente;	
		
		IdSiguiente++;										//haciendo esto en cada objeto le dara id=IdSiguiente, como lo incrementamos cada vez que creemos un objeto, al crear un nuevo objeto le da nuevo id
		
	}
	
	public void cambiaSeccion (String seccion) {			//setter
		
		this.seccion = seccion;
	}
	
	public String devuelveDatos () {						//getter
		 
		return "El nombre es: " + nombre + ", la sección es " + seccion + " y el Id es " + Id;
	}		
	
	//creamos un metodo static para ver su funcionamiento
	//lo llamamos en static.java
	//si IdSiguiente no fuera static no podriamos llamarlo
	
	public static String dameIdSiguiente() {
		
		return "El siguiente Id es: " + IdSiguiente;
	}

}
