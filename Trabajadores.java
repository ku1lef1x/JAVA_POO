package interfaces;

public interface Trabajadores {
	
	double establece_bonus(double gratificacion);	
	//no hace falta incluir delante del metodo public abstract.
	
	
	//imaginemos que minimo se dan 1500e y aparte una bonificacion por el rendimiento	
	public static final double bonus_base=1500; //se puede omitir el public static final

}
