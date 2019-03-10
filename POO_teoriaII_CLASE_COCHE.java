
/*Analizaremos los terminos de clase, objeto, ejemplarizar una clase, modularizacion...
 * 
 *Veremos primero los dos terminos quizas mas importantes, clase y objeto:
 *
 *		A. CLASE:
 *				
 *				Modelo donde se redactan las caracteristicas comunes de un grupo de objetos.
 *
 *				Muchos coches comparten lo que se denomina la plataforma, es decir, la base del coche
 *				ruedas, motor, chasis,.. Sobre esta plataforma, que son las caracteristicas comunes,
 *				se van montando los objetos
 *
 * 				
 * 				La clase serian las caracteristicas comunes de estos coches, es decir, la plataforma
 * 				y los objetos serian los distintos ejemplares o ejemplos, es decir, los distintos modelos
 * 				que comparten plataforma. O dicho de otra forma, los objetos que se construyen a partir de esa clase. 
 * 
 *  			En una clase se define la plataforma y luego se crean los objetos, cada uno con sus caracteristicas propias
 *  			Por tanto, clase, caracteristicas comunes de los objetos.
 *  
 *  	
 *  	B. OBJETO:
 *  
 *  			Ejemplares pertenecientes a las clases.
 *  			Comparten caracteristicas comunes creadas en la clase, pero cada uno tiene sus propias caracteristicas 
 * 				y propiedades, a pesar de pertenecer a la misma clase.
 * 
 * 				Cada objeto tendra sus propiedades o atributos (color, tamaño...) y sus comportamientos (arrancar, frenar...)
 * 				es decir, que son capaces de hacer.
 * 
 * 
 * 
 * En JAVA se podria crear una clase coche en la que se establecerian las caracteristicas comunes, es decir la plataforma,  y a raiz
 * de ahi podriamos crear distintos objetos que tendrian dicha plataforma en comun. 
 * 
 * Para acceder a las propiedades de un objeto:
 * 
 * nombreObjeto.propiedadObjeto=valorPropiedad;
 * 
 * Para acceder a los comportamientos de un objeto:
 * 
 * nombreObjeto.comportamiento o metodo();			//para crear un comportamiento en java, creamos un metodo
 * 
 * En pseudocodigo:
 * 
 * 		Objeto:
 * 			Accediendo a propiedades del objeto desde el codigo* 
 * 			- Renault.color="rojo";
 * 			- Renault.peso=1500;
 * 			- Renault.ancho=2000;
 * 			- Renault.altoo=900;
 * 
 * 			Accediendo a comportamiento de objeto desde el codigo
 * 			- Renault.arranca();
 * 			- Renault.frena();
 * 			- Renault.gira();
 * 			- Renault.acelera();
 * 
 * 
 * Representaremos el ejemplo del coche en JAVA:
 * 
 * 		1. Hay que crear la clase que establezca el modelo donde se indicaran las caracteristicas comunes de los objetos. 
 * 		Dicha clase será la clase Coche. No crearemos metodo Main.
 * 
 * 		2. Una vez especificadas las caracteristicas comunes, debemos establecer las cantidades, es decir, cuantas ruedas, 
	   	el largo, ancho, los cc del motor...
	  
	  	Para ello, en java utilizamos lo que se conoce como un METODO CONSTRUCTOR. Estos metodos son unos metodos especiales
	  	encargador de dar un estado inicial a nuestros objetos
	  	El metodo constructor SIEMPRE tiene el mismo nombre de la clase, lo que lo diferencia del resto de metodos.
	  	
	  	
	  	3. Ya tenemos la clase con la estructura comun, ahora hay que crear los dos objetos, es decir, 
	  	instanciar la clase. Para ello creamos otra clase (Uso_Coche) */

package poo_introduccion;

public class POO_teoriaII_CLASE_COCHE {
	
	
	}


