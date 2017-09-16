import java.util.Scanner;

public class Ej0401_TablaDeMultiplicar {
	/* Dado un entero N entre 1 y 10 (inclusive), la computadora muestra la tabla de multiplicar de N
	 * Ejemplo:
	 * Si ingresa un 9 =>
	 * 9 x 1 = 9
	 * 9 x 2 = 18
	 * 9 x 3 = 27 [...]
	 * Datos de entrada:
	 * numero n = entero
	 * Datos de salida:
	 * productos = enteros */

	public static void main(String[] args) {
		
		int num, cont;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		cont = 1;
		
		System.out.println("Por favor, ingrese un número del 1 al 10: ");
		num = entrada.nextInt();
		
		if (num < 1 || num > 10) {
			System.out.println("El número debe estar entre 1 y 10. Por favor ingrese otro número.");
		}
		else {
			while (cont <= 10) {
				System.out.println(num + " x " + cont + " = " + (num*cont));
				cont++;
			}
		}

	}

}
