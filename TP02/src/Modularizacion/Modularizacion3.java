package Modularizacion;

public class Modularizacion3 {

	//Usamos public static int y return por que le indicamos a la funcion el tipo de dato que devuelve)//
	public static int sumar(int numero1,int numero2) {
		return numero1+numero2;
		
	}
	
	public static void main(String[] args) {
		int num1=30;
		int num2=10;
		
		System.out.println("La suma entre "+num1+" + "+num2+" es "+sumar(num1,num2));

	}

}
