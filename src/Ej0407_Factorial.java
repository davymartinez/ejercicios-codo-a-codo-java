import java.util.Scanner;

public class Ej0407_Factorial {
	/* Se ingresa un número natural. La computadora muestra el factorial del número.
	 * Ejemplo: Se ingresa 5, la computadora muestra 120. */

	public static void main(String[] args) {
		
		int num, factorial;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a calcularle factorial: ");
		num = entrada.nextInt();
		
		factorial = 1;
		
		if (num == 0) {
			factorial = 1;
		} else {
			for (int i=1; i<=num; i++) {
				factorial *= i;
			}
		}
		
		System.out.println("El factorial de " + num + " es: " + factorial);
		
	}

}
