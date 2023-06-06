package Modularizacion;

public class Modularizacion2 {
	
	public static void mostrarEdad(int edad) {
		System.out.println("Su edad es: "+edad+ " años");
	}
	
	public static void main(String[] args) {
		//Al ser una funcion la variable edad dentro de "mostrarEdad es independiente del main"//
		//Por eso al ejecutar el codigo el valor 100 no figura en consola//
		int edad=100;
		
		mostrarEdad(20);
		mostrarEdad(50);
	

	}

}
