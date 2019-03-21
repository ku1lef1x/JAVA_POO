package pooII;

public class Static {

	public static void main(String[] args) {
		
		//creamos objetos 
		
		Empleados_Static trabajador1 = new Empleados_Static("Jesús");
		
		Empleados_Static trabajador2 = new Empleados_Static("Alba");	
		
		Empleados_Static trabajador3 = new Empleados_Static("Kui");
		
		Empleados_Static trabajador4 = new Empleados_Static("Vulpix");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" +
		trabajador2.devuelveDatos() + "\n" + 
		trabajador3.devuelveDatos() + "\n" + 
		trabajador4.devuelveDatos());											//concatenando con "\n" conseguimos dar un salto de linea entre cada trabajador
																				//y expresarlo todo en el mismo System.out.print
		
		
		System.out.println(Empleados_Static.dameIdSiguiente());					//llamamos al metodo static con clase.metodo

	}

}
