package Ejercicio04;

public class Test {

	public static void probarPonerApellido(Persona persona, String apellido) {
		if (persona.ponerApellido(apellido)) {
			System.out.println("Prueba exitosa");
		} else {
			System.out.println("Prueba erronea");
		}
	}

	public static void probarPonerNombre(Persona persona, String nombre) {
		if (persona.ponerNombre(nombre)) {
			System.out.println("Prueba exitosa");

		} else {
			System.out.println("Prueba erronea");
		}
	}

	public static void main(String[] args) {
		Persona persona1 = new Persona();

		probarPonerNombre(persona1, "");
		probarPonerApellido(persona1, "");
		persona1.obtenerNombreCompleto();

		System.out.println(persona1.obtenerNombreCompleto());

		Persona persona2 = new Persona();

		probarPonerNombre(persona2, "");
		probarPonerApellido(persona2, "");
		persona2.obtenerNombreCompleto();

		System.out.println(persona2.obtenerNombreCompleto());

	}

}
