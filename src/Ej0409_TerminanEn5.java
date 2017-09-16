import java.util.Scanner;

public class Ej0409_TerminanEn5 {
	/* El usuario ingresa un valor N. Escriba un programa que imprima los primeros N
	 * números terminados en 5.
	 * Ejemplo: Se ingresa 10, la computadora muestra 5 15 25 35 45 55 65 75 85 95. */

	public static void main(String[] args) {
		
		int num, contador, multiplo;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor ingrese la cantidad de numeros terminados en 5 que desee imprimir: ");
		num = entrada.nextInt();
		contador = 0;
		multiplo = 5;
		
		while (contador < num) {
			if (multiplo % 10 != 0) {
				System.out.print(multiplo + " ");
			}
			contador++;
			multiplo += 10;
		}
		
	}

}
