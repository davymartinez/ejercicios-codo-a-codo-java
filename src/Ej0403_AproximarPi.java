import java.util.Scanner;

public class Ej0403_AproximarPi {

	public static void main(String[] args) {
		
		/* Dada la cantidad de términos a considerar entre los paréntesis, la computadora muestra el valor 
		 * de la correspondiente aproximación
		 * de Pi: 4 · (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + 1/n).
		 * Ejemplo: Se ingresa 5, la computadora muestra 3.33968 */
		
		double cantTerm, cont, denom, term, acum;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		cont = 1;
		denom = 1;
		acum = 0;
		
		System.out.println("Escriba la cantidad de terminos a considerar: ");
		cantTerm = entrada.nextInt();
		
		while (cont <= cantTerm) {
			if (cont % 2 == 0) {
				term = -(1/denom);
			}
			else {
				term = (1/denom);
			}
			cont++;
			denom += 2;
			acum += term;
		}
		
		System.out.println("El resultado es: " + (4*acum));

	}

}
