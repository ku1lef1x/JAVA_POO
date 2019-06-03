/*Creamos una clase jefe que hereda de empleado ya que los jefes pueden tener incentivos*/

package herenciaII;

public final class Jefatura extends Empleado {   //indicar final delante de la clase hace que no pueda heredar otra clase de ella
	
	private double incentivo;
	
	
	//creamos objeto constructor jefatura.
	
	public Jefatura(String nom, double sueldo, int agno, int mes, int dia) {
		
		super(nom, sueldo, agno, mes, dia);
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;		
	}
	
	public final double dameSueldo() {					//este metodo invalida para Jefatura el dameSueldo() de Empleado
		//indicar el metodo final hace que no se pueda sobreescribir mas
		
		double sueldoJefe = super.dameSueldo();		//llamamos a dameSueldo de la clase padre
		
		return sueldoJefe + incentivo;
	}	

}


/*
 * Por tanto,  
 * 
 * Final delante de una clase: Impide que otra clase pueda heredar de ella
 * 
 * Final delante de un metodo: Hace que el metodo no pueda ser sobreescrito
 * */
 