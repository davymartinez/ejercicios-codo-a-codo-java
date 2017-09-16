import java.util.Scanner;

public class Ej0410_SumaCuadrados {
	/* El usuario ingresa un valor N. Escriba un programa que calcule la suma de los
	 * cuadrados de los N primeros números naturales.
	 * Ejemplo: Se ingresa 6, la computadora muestra 91 */

	public static void main(String[] args) {
		
		int num, sumaCuad;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de cuadrados que desea sumar: ");
		num = entrada.nextInt();
		
		sumaCuad = 0;
		
		for (int i = 0; i <= num; i++) {
			sumaCuad += (i*i);
		}
		
		System.out.println("La suma de los primeros " + num + " cuadrados es: " + sumaCuad);

	}

}
