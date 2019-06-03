package herenciaII;

public class Empresa {

	public static void main(String[] args) {
		
		//creamos un jefe
		Jefatura jefe1 = new Jefatura ("Alba", 80000, 2000, 2, 19);		
		jefe1.estableceIncentivo(500);		
		
		//creamos array tipo Empleado para ir añadiendo objetos a el
		Empleado [] empleados = new Empleado [2];
		
		//creamos un empleado en la primera posicion del array
		empleados[0] = new Empleado ("Jesús", 80000, 2000, 4, 27);
		
		//creamos un jefe (hereda de empleado) en la segunda posicion del array
		empleados [1] = jefe1;
		
		//recorremos el array para subir el sueldo al jefe con el incentivo establecido anteriormente
		for (int i=1; i<empleados.length; i++) {
			
			System.out.println(empleados[1].dameSueldo());
		}
		
		//recorremos el array para mostrar datos de los empleados y fecha de alta 
		//la variable e, se comportara de una forma u otra dependiendo de si corresponde Jefe o Empleado
		//esto se conoce como polimorfismo. 
		//El enlazado dinamico permite que la VM de JAVA sepa si tiene que llamar a un metodo de la 
		//clase o de la super clase.
		for (Empleado e:empleados) {
			
			System.out.println(e.nombre + "\n" + e.dameFechaContrato() + "\n" + e.dameSueldo());
		}
		
		// Si queremos transformar un objeto en otro tipo:	
		// Tipo_dato nombre_objeto = (Tipo al que vamos a convertir) objeto_a_convertir;
		// Se debe hacer con sentido, un empleado no siempre es un jefe asi que no se le podria aplicar casting
		Jefatura jefa_Finanzas = (Jefatura) empleados [1];
		
		//este proceso se denomina Casting y nos permite, al ser un array de empleados, 
		//poder aplicar metodos de Jefatura en la posicion 1 del array. 		
		jefa_Finanzas.estableceIncentivo(200.00);
		
		//recorremos para ver los cambios		
		for (Empleado e:empleados) {
			
			System.out.println(e.nombre + "\n" + e.dameFechaContrato() + "\n" + e.dameSueldo());
		}

	}

}
