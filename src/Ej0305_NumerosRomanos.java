import java.util.Scanner;

public class Ej0305_NumerosRomanos {
	
	/* El usuario ingresa un número y la computadora le muestra su correspondiente representación en número romano. 
	 * No se debe ingresar un valor distinto de 1, 5, 10, 50, 100, 500, 1000.
	 * Ejemplo: Se ingresa 500, la computadora muestra ‘D’. */

	public static void main(String[] args) {
		
		int num = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero a convertir. Unicas opciones posibles: 1, 5, 10, 50, 100, 500 y 1000: ");
		num = entrada.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("El numero 1 en romano es: I");
				break;
			case 5:
				System.out.println("El numero 5 en romano es: V");
				break;
			case 10:
				System.out.println("El numero 10 en romano es: X");
				break;
			case 50:
				System.out.println("El numero 50 en romano es: L");
				break;
			case 100:
				System.out.println("El numero 100 en romano es: C");
				break;
			case 500:
				System.out.println("El numero 500 en romano es: D");
				break;
			case 1000:
				System.out.println("El numero 1000 en romano es: M");
				break;
			default:
				System.out.println("Numero ingresado invalido.");
				break;
		}

	}

}
