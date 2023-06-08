package Ejercicio04;

public class Persona {
	private String nombre;
	private String apellido;

	public boolean ponerNombre(String nombre) {
		boolean pudoPonerNombre = true;
		if (nombre.isEmpty()) {
			pudoPonerNombre = false;
		} else {

			this.nombre = nombre;
		}
		return pudoPonerNombre;

	}

	public boolean ponerApellido(String apellido) {
		boolean pudoPonerApellido = true;
		if (apellido.isEmpty()) {
			pudoPonerApellido = false;
		} else {
			this.apellido = apellido;
		}
		return pudoPonerApellido;

	}

	public String obtenerNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

}
