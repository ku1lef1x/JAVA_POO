package paquetepruebas2;

public class Clase1 {
	
	//añadimos modificador acceso protected para poder acceder a las variables desde otros paquetes
	
	protected int mivar = 5;
	
	protected int mivar2 = 7;
	
	protected String mimetodo() {
		
		return "El valor de mi_var2 es: " + mivar2;
	}

}
