package test_creacion_uso_objetos;

import javax.swing.JOptionPane;

public class Escoger_Teclado {
	
	public static void main(String[] args) {
		
		Teclado nuevo_teclado = new Teclado();
		
		nuevo_teclado.tipo_teclas(JOptionPane.showInputDialog("Introduce el tipo de teclas que quieres en tu teclado: "));
		
		System.out.println(nuevo_teclado.devuelve_teclas());
		
		nuevo_teclado.tipo_switch(JOptionPane.showInputDialog("Introduce el tipo de switch que quieres en tu teclado:"));
		
		System.out.println(nuevo_teclado.devuelve_switch());
		
		nuevo_teclado.tipo_material(JOptionPane.showInputDialog("Introduce el tipo de material que quieres para tu nuevo teclado"));
		
		System.out.println(nuevo_teclado.devuelve_material());
		
		int precio = nuevo_teclado.establece_precio();
		
		System.out.println("El precio final del teclado será: " + precio);
	}

}
