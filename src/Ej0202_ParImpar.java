import java.util.Scanner;

public class Ej0202_ParImpar {
	/* Dado un número, la computadora indica si es par o impar.
	 * Datos de entrada: numero: entero
	 * Datos de salida: cadenas de texto */
	public static void main(String[] args) {

	int numero;
	@SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Por favor, ingrese un numero: ");
	numero = entrada.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("El numero " + numero + " es par.");
	}
	else {
		System.out.println("El numero " + numero + " es impar.");
	}

	}

}
