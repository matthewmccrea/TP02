package Ejemplo02;

public class Persona {

	private String colorDeOjos;
	public int edad;
	private int pasosRealizados;

	public Persona() {
		this.pasosRealizados = 0;
	}

	public void caminarPasos() {
		this.setPasosRealizados(this.getPasosRealizados() + 5);

	};

	public void frenar() {

	};

	private void setPasosRealizados(int pasosRealizados) {
		this.pasosRealizados = pasosRealizados;
	}

	public int getPasosRealizados() {
		return this.pasosRealizados;
	}

	public void setEdad(int edad) {
		if (edad > 110) {
			edad = 110;
		}else if (edad<1) {
			edad = 1;
		}

		this.edad = edad;
	};

	public int getEdad() {
		return this.edad;
	}
	public boolean setColorDeOjos(String color) {
		boolean ingresoCorrecto = false;
		switch (color) {
		case "Marrones":
		case "Azules":
		case "Verdes":
			ingresoCorrecto = true;
		}
		if (ingresoCorrecto) {
			this.colorDeOjos = color;
		}
		return ingresoCorrecto;
	};
	public String getColorDeOjos() {
		return this.colorDeOjos;
	}
}
