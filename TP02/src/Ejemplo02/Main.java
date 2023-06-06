package Ejemplo02;

public class Main {

	public static void mostrarPersona(Persona persona) {
		System.out.println("La edad de la persona es " + persona.getEdad() + " y el color de ojos de la persona es "
				+ persona.getColorDeOjos()+" y camino "+persona.getPasosRealizados()+" pasos");
	}

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();

		persona1.setEdad(25);
		persona1.setColorDeOjos("Marrones");
		persona1.caminarPasos();
		persona1.caminarPasos();

		persona2.setEdad(35); 
		persona2.setColorDeOjos("Azules");
		persona2.caminarPasos();

		persona3.setEdad(55); 
		persona3.setColorDeOjos("Verdes");
		persona3.caminarPasos();
		persona3.caminarPasos();
		persona3.caminarPasos();
		

		mostrarPersona(persona1);
		mostrarPersona(persona2);
		mostrarPersona(persona3);

	}

}
