import java.util.Scanner;

public class Ej0108_ConvTemp {
	
	/* Dada una temperatura en grados centígrados, la computadora la muestra en grados Fahrenheit. */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int tempG = 0;
		double tempF = 0;
		
		System.out.println("Por favor ingrese temperatura en C: ");
		tempG = entrada.nextInt();
		
		tempF = (tempG * 1.8) + 32;
		
		System.out.println(tempG + " grados C son " + tempF + " grados F.");
		
	}

}
