package Modularizacion;

import java.util.Scanner;

public class Modularizacion4 {

	public static Scanner input = new Scanner (System.in);
	
	public static int ingreseEdad() {
		int edadIngresada;
		do {
			
			System.out.println("Ingrese su edad");
			edadIngresada = Integer.parseInt(input.nextLine());
		}while(edadIngresada<0||edadIngresada>120);
			return edadIngresada;
	}
	public static int ingreseCantidadMascotas() {
		int mascotasIngresadas;
		do {
			
			System.out.println("Ingrese la cantidad de mascotas");
			mascotasIngresadas = Integer.parseInt(input.nextLine());
			}while(mascotasIngresadas<0||mascotasIngresadas>100);
		return mascotasIngresadas;
	}
	public static int ingreseNumero (String mensaje, int desde, int hasta) {
		int numero;
		do {
			System.out.println("Ingrese numero");
			numero= Integer.parseInt(input.nextLine());
		}while(numero<desde||numero>hasta);
			return numero;
		}
	
	
	
	
	public static void main(String[] args) {
		int edad,mascotas;
		
		edad= ingreseEdad();
				
		System.out.println("Su edad es "+edad);
		
		mascotas= ingreseCantidadMascotas();
		
		System.out.println("La cantidad de mascotas es: "+mascotas);
		
	}

}
