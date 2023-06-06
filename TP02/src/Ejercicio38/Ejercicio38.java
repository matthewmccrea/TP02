package Ejercicio38;

import java.util.Scanner;

public class Ejercicio38 {

	
	/*Realizá un programa que permita controlar con validación el ingreso a un sitio web. Teniendo
ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), el programa
debe permitir al usuario ingresar sus credenciales. Si las mismas son erróneas, se volverán a
pedir hasta un máximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado la
cuenta".
*/
		public static final String USUARIO = "admin";
		public static final String CLAVE = "123456";
		public static final int CANTIDAD_MAXIMA_DE_INTENTOS=3;
		
		public static Scanner input = new Scanner (System.in);
		
		public static String ingreseTexto(String mensaje) {
			String texto;
			do {
				System.out.println(mensaje);
				texto = input.nextLine();
			}while(texto.isEmpty());
			return texto;
		}

		public static void mostrarSalida(boolean credencialesCorrectas) {
			if (credencialesCorrectas) {
				System.out.println("Acceso concedido");
			}else {
				System.out.println("Se ha bloqueado la cuenta");
			}
		}
		
		public static void main(String[] args) {
		String usuario;
		String clave;
		boolean credencialesCorrectas=false;
		int cantidadDeIntentos=0;
		
		do {
		usuario = ingreseTexto("Ingrese Usuario");
		clave = ingreseTexto("Ingrese clave");
		if(usuario.equals(USUARIO)&&clave.equals(CLAVE)) {
			credencialesCorrectas = true;
		}else {
			cantidadDeIntentos++;
		}
		}while(!credencialesCorrectas&&cantidadDeIntentos<CANTIDAD_MAXIMA_DE_INTENTOS);
		
		//System.out.println("Usuario:"+usuario+" Clave:"+clave);
		mostrarSalida(credencialesCorrectas);
		System.out.println("Usuario:"+usuario+" Clave:"+clave);
		input.close();
	}

}
