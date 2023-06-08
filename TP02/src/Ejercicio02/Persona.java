package Ejercicio02;

public class Persona {
	private String nombre;
	private String apellido;

	
	
	public boolean ponerNombre(String nombre) {
		boolean pudoPonerNombre = true;
		
		if (nombre.isEmpty()) {
			pudoPonerNombre = false;
		}else {
			this.nombre=nombre;
		}
		return pudoPonerNombre;
		
		
	}
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	public String obtenerNombreCompleto () {
		return this.nombre+this.apellido;
	};

}
