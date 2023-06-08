package Ejercicio02;

public class Test {
	
	public static void probarPonerNombre(Persona persona, String nombre) {
		if (persona.ponerNombre(nombre)){
			System.out.println("Prueba exitosa");
		}else {

			System.out.println("Prueba erronea");
		};

		
		
	}
	

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		
		probarPonerNombre(persona1,"Fulanito");
		persona1.ponerApellido(" Lopez");
		
		
		System.out.println(persona1.obtenerNombreCompleto());

		Persona persona2 = new Persona();
		
		persona2.ponerNombre("Marcos ");
		persona2.ponerApellido("Gimenez");
		
		System.out.println(persona2.obtenerNombreCompleto());
		
	}

}
