import java.util.*;
public class Ej0303_NumeroMes {
	/* Escribir un programa que pida al usuario un número entre 1 y 12. La computadora muestra por 
	 * pantalla el mes al que pertenece tal número. Si se ingresa un número fuera de rango, mostrar un 
	 * error.
	 * Ejemplo: Se ingresa un 4, la computadora muestra “ABRIL”. */
	
	public static void main(String[] args) {
		
		int num;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 12: ");
		num = entrada.nextInt();
		
		if (num < 1 || num > 12) {
			System.out.println("Número ingresado inválido. Por favor ingrese número entre 1 y 12.");
		} else {
			switch(num) {
				case 1:
					System.out.println("ENERO");
					break;
				case 2:
					System.out.println("FEBRERO");
					break;
				case 3:
					System.out.println("MARZO");
					break;
				case 4:
					System.out.println("ABRIL");
					break;
				case 5:
					System.out.println("MAYO");
					break;
				case 6:
					System.out.println("JUNIO");
					break;
				case 7:
					System.out.println("JULIO");
					break;
				case 8:
					System.out.println("AGOSTO");
					break;
				case 9:
					System.out.println("SEPTIEMBRE");
					break;
				case 10:
					System.out.println("OCTUBRE");
					break;
				case 11:
					System.out.println("NOVIEMBRE");
					break;
				case 12:
					System.out.println("DICIEMBRE");
					break;
			}
		}
		
	}

}
