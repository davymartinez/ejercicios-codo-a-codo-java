import java.util.*;

public class Ej0109_Segundos {
	
	/* Dado un tiempo en segundos, la computadora lo muestra expresado en días, horas, minutos y segundos.
	Ejemplo: Ingresa 1000000, debe devolver 11d, 13h, 46m y 40s. */

	public static void main(String[] args) {
		
		float segundos;
		float segundosFinales;
		float minutos;
		float horas;
		float dias;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad en segundos a analizar: ");
		segundos = entrada.nextFloat();
		
		dias = segundos / 86400;
		horas = 24 * (dias % 1);
		minutos = 60 * (horas % 1);
		segundosFinales = 60 * (minutos % 1);
		
		System.out.println((int) segundos + " segundos son " + (int) dias + " dias " + (int) horas + " hrs " + 
		(int) minutos + " mins y " + (int) segundosFinales + " segs ");
		
	}

}
