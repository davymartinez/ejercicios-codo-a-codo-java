import java.util.*;
public class Ej0201_EsPositivo {
	
	/* Dado un n�mero, la computadora indica si es positivo. */

	public static void main(String[] args) {
		
		int numero;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese n�mero: ");
		numero = entrada.nextInt();
		
		if (numero < 0) {
			System.out.println("El n�mero " + numero + " es negativo."); 
		} else {
			System.out.println("El n�mero " + numero + " es positivo.");
		}
		
	}

}
