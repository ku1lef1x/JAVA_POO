/* Imaginemos que queremos acceder a alguno de los datos encapsulados. En principio solo podriamos acceder desde su propia clase. 
 * 
 * Los metodos permiten comunicar una clase con otra. Analizaremos dos tipos de metodos:
 * 				1. Setters (definidores): esta encargado de definir o establecer el valor de una propiedad.
 * 				Modificamos valor propiedad. 
 * 
 * 				2. Getters (captadores): esta encargado de captar o proporcionar el valor de la propiedad.
 * 				Obtenemos el valor de la propiedad. 
 * 
 * 
 * La sintaxis del metodo getter:
 * 
 * public tipo_de_dato_a_devolver nombre_metodo() {codigo + return}
 * 
 * La sintaxis del metodo setter:
 * 
 * public void nombre_metodo(){codigo}				void indica que no devuelve ningun valor, no lleva return
 * 
 * 
 * 
 * ---->Volvemos a Coche para crear el metodo getter. Trabajaremos en Coche y Uso_Coche
 *
 *
 * Ya tenemos la plataforma del coche, pero ahora debemos crear el modelo, es decir, 
 * el coche completo. Completamos el codigo con los datos que pueden variar una vez creado el modelo completo, como por ejemplo el peso
 * Añadimos tambien otras caracteristicas, no private, que podran cambiar dependiendo del tipo de coche y los metodos getters y setters
 * que nos permitiran acceder a los datos, modificarlos...
 * */


package poo_introduccion;

public class Getters_Y_Setters {


}
