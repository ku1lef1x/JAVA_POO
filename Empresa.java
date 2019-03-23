package herenciaII;

public class Empresa {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado ("Jesús", 80000, 2000, 4, 27);
		
		Jefatura jefe1 = new Jefatura ("Alba", 80000, 2000, 2, 19);
		
		jefe1.estableceIncentivo(500);
		System.out.println(jefe1.dameSueldo());

	}

}
