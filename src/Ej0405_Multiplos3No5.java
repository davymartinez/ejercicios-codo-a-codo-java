import java.util.Scanner;

public class Ej0405_Multiplos3No5 {
	/* Dado un número natural N, la computadora muestra los primeros N múltiplos de 3 
	 * excepto aquellos que sean a la vez múltiplos de 5.
	 * Ejemplo: Se ingresa 10, la computadora muestra 3 6 9 12 18 21 24 27 33 36 */

	public static void main(String[] args) {
		int multiplo, contador, numero;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		contador = 0;
		multiplo = 3;
		
		System.out.print("Escriba el numero de multiplos de 3 que no sean multiplos de 5 que desea ver: ");
		numero = entrada.nextInt();
		
		while (contador <= (numero+1)) {
			if (multiplo % 5 != 0) {
				System.out.print(multiplo + " ");
			}
			contador++;
			multiplo += 3;
		}

	}

}
