package interfaces;

public interface Jefes extends Trabajadores {		//Jefe hereda de Trabajadores, asi establecemos jerarquia
	
	//sino ponemos public abstract se presupone por defecto. No es necesario escribir
	
	public abstract String tomar_decisiones(String decision);
}


//al heredar Jefes de Trabajadores, debemos implementar el metodo establece_bonus en Jefaturas 