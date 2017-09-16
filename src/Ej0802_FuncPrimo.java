import java.util.Scanner;

public class Ej0802_FuncPrimo {

	public static void main(String[] args) {
		/* Escribir la función booleana esPrimo, que devuelve true o false dependiendo si un número recibido
		 * como parámetro es primo. */
		
		double num;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese numero a determinar si es primo o no: ");
		num = entrada.nextDouble();
		
		System.out.println("¿El numero ingresado es primo? " + esPrimo(num));
		
	}
	
	static boolean esPrimo(double numero) {
		
		double cont = 1, n = 0;
		boolean numEsPrimo = false;
		
		if (numero == 1) {
			numEsPrimo = false;
		} else {
			if (numero == 2 || numero == 3) {
				numEsPrimo = true;
			} else {
				if (numero % 2 == 0 || numero % 3 == 0) {
					numEsPrimo = false;
				} else {
					// revisar este test de primalidad (no está validando para num = 25)
					while (cont <= Math.sqrt(numero)) {
						n = 6 * cont + 1;
						if (n % numero == 0) {
							numEsPrimo = false;
						} else {
							numEsPrimo = true;
						}
						cont++;
					}
				}
			}
		}
		return numEsPrimo;
	}

}
