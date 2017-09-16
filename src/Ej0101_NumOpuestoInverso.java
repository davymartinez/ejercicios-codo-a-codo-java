import java.util.Scanner;

public class Ej0101_NumOpuestoInverso {

	public static void main(String[] args) {
		/* Ingresar un número y que la computadora muestre su opuesto y su inverso.
		 * Datos:
		 * numero, opuesto: entero
		 * inverso: real */
		int num, opuesto;
		double inverso;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero: ");
		num = entrada.nextInt();
		
		opuesto = num * (-1);
		inverso = 1 / (double) num;
		
		System.out.println("El opuesto del numero es: " + opuesto);
		System.out.println("El inverso del numero es: " + inverso);
	}

}
