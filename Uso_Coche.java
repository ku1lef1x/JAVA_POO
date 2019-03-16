package poo_introduccion;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		
		//creamos los objetos
		
		Coche micoche = new Coche();			//instanciar una clase, ejemplar de clase, micoche es instancia de la clase coche
		
		System.out.println(micoche.dime_datos_generales());
		
		//damos color al coche
		micoche.establece_color(JOptionPane.showInputDialog("Introduce el color"));				//establecemos el color del coche que queramos
																	
		System.out.println(micoche.dime_color());			//muestra que el color del coche es azul
															//sino utilizamos el metodo setter no se establece color y 
															//no muestra color en el mensaje ya que no hay ninguno establecido
		
		//ponemos asientos de cuero o no
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene el coche asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());		//mostramos si tiene o no asientos de cuero
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));	 			//climatizador
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());		//indica el peso del coche
		
		System.out.println("El precio del coche es " + micoche.precio_coche());
	}

}

/*Sin darnos cuenta hemos modularizado un programa, creando la clase coche y su uso. Una clase no puede
 * funcionar sin la otra.
 * 
 *  Cuando modularizamos siempre ocurre que hay una clase que es la principal. Esta clase es la que contiene el Main.
 *  En nuetro caso, el metodo main esta en la clase Uso_Coche, por tanto, la ejecucion del programa comenzaria por ahi. 
 *  Cuando llega a la instruccion new Coche, el flujo llama al constructor de la clase a la que pertenece el objeto
 *  y nos aporta todos los estados iniciales de la clase coche. 
 *  
 *  Al invocar al constructor ya sabe que el objeto renault creado ya tiene 4 ruedas, un largo de 2000....
 *  */
