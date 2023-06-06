package Ejercicio01;

public class Main {

	public static void main(String[] args) {

		Ejercicio1 ejercicio1 = new Ejercicio1();

		System.out.println(ejercicio1.sumar(10, 20));
		
		int numero1 = (ejercicio1.pedirNumero("Ingresa un numero", 0, 10));
		
		int numero2 = (ejercicio1.pedirNumero("Ingrese un numero", 10, 100));
		
		System.out.println(ejercicio1.sumar(numero1, numero2));
		
		
	}

}
