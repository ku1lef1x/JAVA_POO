/*
 * A veces nos surge la necesidad de almacenar en una variable una serie de valores, pero no queremos
 * que en un futuro se puedan almacenar mas valores o modificar los existentes. 
 * 
 * Imaginemos que queremos almacenar una serie de tallas, que queremos usar en nuestro programa. 
 * 
 * No queremos que se pueda almacenar algo que no sea una talla, ni modificar son elementos. 
 * 
 * 
 * Aqui entra en juego los enumerados, que son objetos que permiten almacenar una serie de valores y
 * solo se podra almacenar ese grupo, ningun otro. 
 * 
 * 
 * Para declarar un tipo enumerado debemos hacerlo fuera del main. 
 * */

package paquete_cosas_sueltas;

public class Uso_Tallas {
	
	//creamos el tipo enumerado: Dentro de las llaves ponemos los valores que queramos que formen parte
	enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	

	public static void main(String[] args) {
		
		//Dentro del main podemos hacer lo siguiente:
		
		Talla s = Talla.MINI;		//en el objeto S almacenamos el valor MINI
		
		Talla m = Talla.MEDIANO;
		
		Talla l = Talla.GRANDE;
		
		Talla xl = Talla.MUY_GRANDE;
		
		//no nos dejara almacenar dentro de cualquier talla un valor que no sea 
		//MINI, MEDIANO, GRANDE, MUY_GRANDE
		
		//podemos usar el enumerado como queramos, pedir que se introduzca una talla y que se diga 
		//cual es. Tambien permite la creacion de metodos getter y setter y de constructores. 
		
			

	}

}
