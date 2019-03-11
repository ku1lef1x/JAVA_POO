/*Como hemos comentado anteriormente, las clases de un programa de java se conectaran de una forma u otra. 
 * Estas clases se comunican entre si con metodos. Cuando varias clases estan comunicadas entre si debemos utilizar la
 * ENCAPSULACION.
 * 
 * 
 * Hay ciertas cosas o funciones que solo se pueden hacer desde su propio modulo o clase. Y hay cosas que solo se haran en el Main
 * por tanto la encapsulacion consiste en realizar las funciones propias de una clase dentro de esta misma clase. 
 * 
 * Por ejemplo, en nuestro codigo anterior hemos utilizado la modularizacion pero no la encapsulacion. Hemos creado 
 * una clase y luego un objeto del cual hemos mostrado sus ruedas, pero no hemos encapsulado. 
 * 
 *  Nosotros podriamos poner Renault.ruedas=3; y el objeto pasaria a tener 3 ruedas, pero nosotros en nuestro objeto constructor
 *  indicamos que el coche tenia 4 ruedas, por lo que no tendria sentido que podamos en otra clase distinta cambiar las ruedas a 3, 
 *  por tanto, hay algunos datos que se deben encapsular de manera que puedan modificarse solo desde su propia clase, en este caso 
 *  las ruedas.
 *  
 *  Para encapsular las ruedas añadimos un modificador de acceso, que consiste en poner la palabra PRIVATE delante del dato que 
 *  queremos encapsular en su declaracion. (modificado en clase Coche). 
 * 
 * 
 *  Al encapsular los datos estos solo son visibles y modificables desde su propia clase, por tanto no podriamos hacer un 
 *  System.out.println(Renault.ruedas) ya que ruedas solo es visible en Coche. 
 *  
 *  Podemos preguntarnos que como podemos por tanto ver las ruedas en otras clases, la respuesta a esto es con los 
 *  METODOS. Hay datos encapsulados pero funcionalidades que no las estan, por tanto en nuestro ejemplo solo nos faltaria 
 *  conectar las dos clases de manera que podamos ver algunas opciones y otras queden encapsuladas.
 *  
 *  Los metodos permiten que las clases interactuen entre si formando una unidad permitiendo que el programa funcione. 
 * 
 * */


package poo_introduccion;

public class Encapsulacion {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	}

}
