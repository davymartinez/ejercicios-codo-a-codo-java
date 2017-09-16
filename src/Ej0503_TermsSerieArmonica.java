import java.util.*;
public class Ej0503_TermsSerieArmonica {
	
	/*Dado un número real L perteneciente al intervalo [1,10], la computadora informa la cantidad de términos de la serie 
	 * armónica necesarios para satisfacer la desigualdad: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n > L.
	 * Ejemplo: Se ingresa 5, la computadora muestra 83. */
	
	public static void main(String[] args) {
		
		int L;
		int n = 0;
		double acumulador = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero real entre 1 y 10: ");
		L = entrada.nextInt();
		
		if (L < 1 || L > 10) {
			System.out.println("El numero debe estar entre 1 y 10");
		} else {
			do {
				n++;
				acumulador += 1.0/n;
			} while (acumulador <= L);
			
			System.out.println("La desigualdad de la serie armonica para " + L + " se satisface con " + n + " terminos.");
			
		}
		
	}

}
