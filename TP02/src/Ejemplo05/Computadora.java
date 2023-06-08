package Ejemplo05;

public class Computadora {
	private Tipo tipo;

	private Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
		
	}

	@Override
	public String toString() {
		return "Computadora [tipo=" + tipo + "]";
	}
	
	
	

}
