
//Creamos la clase furgoneta, con EXTENDS COCHE lo que hace FURGONETA que herede las caraceristicas y metodos de COCHE
//a parte, la clase furgoneta tendra sus propias variables (capacidad de carga y asientos extras) y sus propios metodos.
//La clase Coche seria una super clase, y la clase Furgoneta una subclase
	
package pooII;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
			
		super();											//esta instruccion llama al constructor de la clase padre			
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	public String dimeDatosFurgoneta(){
		
		return "La capacidad de carga es: " + capacidad_carga + ", y las plazas son: " + plazas_extra;
	}
}