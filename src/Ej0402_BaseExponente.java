import java.util.Scanner;

public class Ej0402_BaseExponente {
	/* Dados dos números naturales b y e, la computadora muestra el valor de b^e.
	 * Datos de entrada:
	 * base, exponente = entero
	 * Datos de salida:
	 * potencia = entero */

	public static void main(String[] args) {
		
		int base, exp, pot, cont;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la base: ");
		base = entrada.nextInt();
		System.out.println("Ingrese el exponente: ");
		exp = entrada.nextInt();
		
		cont = 1;
		pot = 1;
		
		while (cont <= exp) {
			pot *= base;
			cont++;
		}
		
		System.out.println("La potencia es: " + pot);

	}

}
