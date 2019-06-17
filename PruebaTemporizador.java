/*
 * Crearemos un temporizador que cada x segundos, lanzará un mensaje por consola que indicará la hora 
 * que es en ese momento.
 * 
 * Para realizar un temporizador necesitamos el paquete javax.swing el cual contiene la clase Timer, 
 * que nos permite realizar el temporizador. Timer nos permite crear un objeto y necesita dos parametros
 * timer(delay, interfaz listener) siendo delay los milisegundos que queremos que pasen entre 
 * cada vez que se ejecute la accion
 * */



package temporizador;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;


public class PruebaTemporizador {

	public static void main(String[] args) {	
		
		//instanciamos objeto de la clase DameLaHora, con la accion que da la hora actual
		DameLaHora oyente = new DameLaHora();
		
		//tambien podriamos instanciar para oyente:		
		//ActionListener oyente = new DameLaHora();
		
		/*instanciamos objeto de la clase Timer para crear temporizador
		le pasamos 5segundos(5000 miliseg) y el objeto oyente de la clase DameLaHora*/
		Timer mitemporizador = new Timer(5000, oyente);
		
		mitemporizador.start();		//iniciamos el temporizador
		
		/*Hacemos que el programa funcione durante el tiempo que queramos;
		esto lo hacemos con el metodo estatico showMessageDialog de la clase JOptionPane.
		Mientras no pulsemos Aceptar no se detendrá el programa ya que no saltara a la siguiente 
		linea de codigo*/
		JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener la ejecución del programa");
		
		
		System.exit(0);		/*con esta instruccion paramos la ejecución del programa.
		se llegara a esta linea al pulsar el boton aceptar del showMessageDialog*/

	}

}


//clase para implementar el ActionListener y usarla como objeto para los parametros de Timer
class DameLaHora implements ActionListener{
	
	//metodo actionPerformed de la interfaz ActionListener
	//la accion que queremos es que muestre la hora
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date(); //almacenamos en la variable ahora la hora actual		
		System.out.println("Te pongo la hora cada 5s. La hora actual es: " + ahora);
	}
	
}
