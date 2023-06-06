package Ejemplo04;

public class Persona {
	private int edad;
	private Bicicleta bicicleta;

	public Persona(int edad, Bicicleta bicicleta) {
		this.setEdad(edad);
		this.setBicicleta(bicicleta);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	@Override
	public String toString() {
		return "Edad " + edad + ", bicicleta de color " + bicicleta.getColor() ;
	}

	
}
