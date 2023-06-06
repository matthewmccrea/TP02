package Ejemplo03;



public class Main {

	public static void mostrarPersona(int id, Persona persona) {
		System.out.println(" Persona "+ id);
		System.out.println("La edad de la persona es " + persona.getEdad() + " y el color de ojos de la persona es "
				+ persona.getColorDeOjos()+" y camino "+persona.getPasosRealizados()+" pasos");
	}

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		Persona persona4 = new Persona("Marrones",40);
		
		persona1.setEdad(25);
		persona1.setColorDeOjos("Marrones");
		persona1.caminarPasos();
		persona1.caminarPasos();
		persona1.caminarPasos(25);

		persona2.setEdad(35); 
		persona2.setColorDeOjos("Azules");
		persona2.caminarPasos();
		persona2.caminarPasos(30);

		persona3.setEdad(55); 
		persona3.setColorDeOjos("Verdes");
		persona3.caminarPasos();
		persona3.caminarPasos();
		persona3.caminarPasos();
		
		
		mostrarPersona(1,persona1);
		mostrarPersona(2,persona2);
		mostrarPersona(3,persona3);
		mostrarPersona(4,persona4);
		
		
		
		
	}

}


