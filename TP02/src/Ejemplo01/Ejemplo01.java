package Ejemplo01;

public class Ejemplo01 {

	public static int setEdad(int edad) {
		return edad + 10;
		
	}

	public static void main(String[] args) {
		int edad;

		edad = 25;
		edad = setEdad(edad);
		
		System.out.println(edad);

	}

}
