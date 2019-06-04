package paquetepruebas2;
import paquetepruebas.Clase3;  //importamos el paquete en el que esta clase 3 para poder usarla

public class Clase2 {

	public static void main(String[] args) {
		
		
		Clase1 miobj = new Clase1();  //Clase1 no tiene constructor, entonces se usa constructor por defecto

		Clase3 miobj2 = new Clase3(); //tiene todos los metodos pertenecientes a la clase 1 ya que hereda de ella
		//para poder acceder a los metodos de la clase1, que esta en otro paquete, debemos hacer las variables
		//public o protected
		
	}

}
