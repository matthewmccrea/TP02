package Ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {
	public Scanner input = new Scanner (System.in);
	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int pedirNumero(String mensaje, int desde, int hasta) {
		int numero = 0;
		System.out.println(mensaje);
		numero = Integer.parseInt(input.nextLine());
		while(numero<desde||numero>hasta) {
			System.out.println("Numero debe estar entre " + desde + " y "+hasta);
			numero = Integer.parseInt(input.nextLine());
			System.out.println(mensaje);
			
		}

		return numero;
	}

}
