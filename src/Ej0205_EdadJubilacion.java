import java.util.*;
public class Ej0205_EdadJubilacion {
	
	/* Dada la edad de una persona y su género (“F” para mujeres, “M” para hombres), 
	 * la computadora indica si está en edad de jubilarse. */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int edad = 0;
		char sexo;
		
		System.out.println("Por favor, ingrese su edad: ");
		edad = entrada.nextInt();
		System.out.println("Por favor, ingrese su genero (M para masculino, F para femenino): ");
		sexo = entrada.next().charAt(0);
		
		if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
			if (edad >= 60 && (sexo == 'F' || sexo == 'f')) {
				System.out.println("Ud. esta en edad de jubilarse.");
			} else {
				if (edad >= 65 && (sexo == 'M' || sexo == 'm')) {
					System.out.println("Ud. esta en edad de jubilarse.");
				} else {
					System.out.println("Ud. no esta en edad de jubilarse.");
				}
			}
		} else {
			System.out.println("Caracter ingresado invalido.");
		}

	}

}
