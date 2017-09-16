import java.util.*;

public class Ej0107_Perimetro {
	
	/*Dada la superficie de un cuadrado (en m2), la computadora muestra su perímetro.
	 * Ejemplo: Ingresa 81, debe devolver 36*/


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		double superf = 0;
		double perim = 0;
		double lado = 0;
		
		System.out.println("Ingrese la superficie del cuadrado: ");
		superf = entrada.nextDouble();
		
		lado = Math.sqrt(superf);
		perim = lado * 4;
		
		System.out.println("El perimetro del cuadrado ingresado es de: " + perim);
		
	}

}
