/*Creamos una clase jefe que hereda de empleado ya que los jefes pueden tener incentivos*/

package herenciaII;

public class Jefatura extends Empleado {
	
	private double incentivo;
	
	
	//creamos objeto constructor jefatura.
	
	public Jefatura(String nom, double sueldo, int agno, int mes, int dia) {
		
		super(nom, sueldo, agno, mes, dia);
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;		
	}
	
	public double dameSueldo() {					//este metodo invalida para Jefatura el dameSueldo() de Empleado
		
		double sueldoJefe = super.dameSueldo();		//llamamos a dameSueldo de la clase padre
		
		return sueldoJefe + incentivo;
	}
	
	
	
	

}
