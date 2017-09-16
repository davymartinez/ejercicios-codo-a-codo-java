import java.util.Scanner;

public class Ej0408_MultiplosABC {
	/* Dados los números naturales A, B y C, la computadora muestra los múltiplos de C 
	 * ubicados entre A y B (sin incluir los extremos).
	 * Ejemplo: Se ingresa 10, 30 y 6, la computadora muestra 12 18 24. */

	public static void main(String[] args) {
		
		int numA, numB, numC;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero A: ");
		numA = entrada.nextInt();
		System.out.println("Ingrese el numero B: ");
		numB = entrada.nextInt();
		System.out.println("Ingrese el numero C: ");
		numC = entrada.nextInt();
		
		for (int i = (numA+1); i < numB; i++) {
			if (i % numC == 0) {
				System.out.print(i + " ");;
			}
		}
		
	}

}
