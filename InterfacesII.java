
/*
 * Crearemos dos interfaces: por un lado la interfaz trabajadores (para establecer bonus)
 * y por otro lado la interfaz Jefes (que podran tomar decisiones).
 * 
 * 
 * Creando por ejemplo la interfaz jefes con el metodo tomar_decisiones() obligamos a que si algun
 * programador que construya una clase de Jefe tenga que implementar la interfaz Jefes, la cual
 * obliga a implementar el metodo para tomar decisiones, ya que queremos que todas las clases que 
 * sean Jefes deben tomar decisiones. 
 * 
 * 
 * Con la interfaz Trabajadores lo que haremos es dar un bonus en Navidad, a todos los trabajadores
 * ya que es una constumbre de la empresa. Al crear el metodo establece_bonus en la interfaz Trabajadores
 * obligamos a que cada vez que una clase implemente la interfaz Trabajadores se debera implementar
 * el metodo establece bonus.
 * */



package interfaces;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class InterfacesII {
	
public static void main(String[] args) {
		
	
		Empleados [] empleados = new Empleados [3];
		
		//creamos un jefe
		Jefaturas jefe1 = new Jefaturas ("Alba", 80000, 2000, 2, 19);		
		jefe1.estableceIncentivo(500);		
		
		empleados[0] = new Empleados ("Jesús", 80000, 2000, 4, 27);		
		empleados[1] = jefe1;
		empleados[2] = new Empleados ("Dayo", 50000, 2019, 6, 1);
		
		//probamos la interfaz Jefes, con el metodo tomar_decisiones.
		System.out.println(jefe1.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		//progamos la interfaz Trabajadores
		System.out.println("El bonus del jefe es: " + jefe1.establece_bonus(500));
		
		for (int i=0; i<1; i++) {			
			
			System.out.println("El bonus de navidad de los empleados es: " + 
					empleados[0].dameNombre() + ": " +	empleados[0].establece_bonus(200) +
					"\n"+
					empleados[2].dameNombre() + ": " +empleados[2].establece_bonus(200));
		}
		
		
		
		/*indicamos la linea para ordenar el array. Si ejecutamos arroja error
		ya que no hemos implementado la interfaz Comparable*/
		Arrays.sort(empleados);
		
		//volvemos a recorrer el array,  ahora ordenado gracias al metodo Sort.		
		for (Empleados e:empleados) {
			
			System.out.println(e.nombre + "\n" + e.dameFechaContrato() + "\n" + e.dameSueldo());
		}
		
		
	}

}

class Empleados implements Comparable, Trabajadores{	 //al implementar la interfaz debemos incluir su metodo abstracto
	
	String nombre;
	double sueldo;
	Date altaContrato;
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {		
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);
		
		nombre = nom;
		sueldo = sue;
		altaContrato=calendario.getTime();		
	}
	
		//getter para devolver el nombre
		public String dameNombre () {
			
			return "El nombre del empleado es " + nombre;
		}
		
		//getter para sueldo
		public double dameSueldo() {
			
			return sueldo;
		}
		
		//geter para fecha de alta
		
		public Date dameFechaContrato() {
			
			return altaContrato;
		}
		
		//setter para aumentar el sueldo
		public void subeSueldo(double porcentaje) {
			
			double aumento = sueldo * porcentaje/100;
			sueldo += aumento;
		}	
		
		
		//creamos el metodo abstracto de la interfaz Comparable compareTo		
		//los ordenaremos por sueldo.
		public int compareTo(Object miObjeto) {
			
			/*convertimos miObjeto en empleado (dentro de otroEmpleado)
			para posteriormente poder comparar*/
			Empleados otroEmpleado = (Empleados) miObjeto;
			
			//si el sueldo de uno, es menor que el suelo de otro, devuelve menos 1
			if(this.sueldo<otroEmpleado.sueldo) {				
				return -1;
				}
			
			//si el sueldo de uno, es mayor que el sueldo de otro, devuelve 1
			if(this.sueldo > otroEmpleado.sueldo) {
				return 1;
				}
			//si ambos sueldos son iguales, devuelve 0
			return 0;
			
			//el metodo sort usará esta función para ordenadar el array. 
		}
		
		//implementamos el metodo de la interfaz Trabajadores. 
		public double establece_bonus(double gratificacion) {
			
			return Trabajadores.bonus_base + gratificacion;
			
		}
}


final class Jefaturas extends Empleados implements Jefes{  
	
	//atributos de Jefatura
	private double incentivo;
	
	
	//creamos objeto constructor jefatura.	
	public Jefaturas(String nom, double sueldo, int agno, int mes, int dia) {
		
		super(nom, sueldo, agno, mes, dia);
		
	}
	
	//metodo para establecer el incentivo
	public void estableceIncentivo(double b) {
		
		incentivo = b;		
	}
	
	//metodo para devolver sueldo con incentivo
	public final double dameSueldo() {	
		//este metodo invalida para Jefatura el dameSueldo() de Empleado
		//indicar el metodo final hace que no se pueda sobreescribir mas
		
		double sueldoJefe = super.dameSueldo();		//llamamos a dameSueldo de la clase padre
		
		return sueldoJefe + incentivo;
	}	
	
	//implementamos el metodo de la interfaz Jefes.
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la siguiente decisión: " + decision; 
	}
	
	//implementamos el metodo de la interfaz Trabajadores ya que Jefes hereda de Trabajadores.
	public double establece_bonus(double gratificacion) {
		
		double prima = 2000; //es exclusiva del jefe.
		
		return Trabajadores.bonus_base + prima + gratificacion;
		
	}

}