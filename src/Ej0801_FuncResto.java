import java.util.Scanner;

public class Ej0801_FuncResto {
	/* Definir la función resto, que devuelve (sin usar el operador %) el resto del cociente
	 * entre dos números enteros recibidos como parámetros */

	public static void main(String[] args) {
		
		int dividendo = 0, divisor = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese dividendo: ");
		dividendo = entrada.nextInt();
		System.out.println("Ingrese divisor: ");
		divisor = entrada.nextInt();
		
		System.out.println("El resto es: " + resto(dividendo,divisor));
		
	}
	
	/* FUNCION RESTO */
	static int resto(int a, int b) {
		
		return a - ((a / b) * b);
		
	}

}
