package Ejemplo04;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona (45, new Bicicleta("Roja"));
		Persona persona2 = new Persona (12, new Bicicleta("Verde"));
		System.out.println(persona1);
		System.out.println(persona2);
		
	}

}
