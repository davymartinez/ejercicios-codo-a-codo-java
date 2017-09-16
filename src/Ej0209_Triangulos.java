import java.util.Scanner;

public class Ej0209_Triangulos {
	
	/* Los tres lados a, b y c de un triángulo deben satisfacer la desigualdad triangular: cada uno de los lados no puede 
	 * ser más largo que la suma de los otros dos. Escriba un programa que reciba como entrada los tres lados de un 
	 * triángulo, e indique: si acaso el triángulo es inválido; y, si no lo es, qué tipo de triángulo es (equilátero, 
	 * isósceles o escaleno).*/

	public static void main(String[] args) {
		
		int ladoA = 0;
		int ladoB = 0;
		int ladoC = 0;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el lado 'A': ");
		ladoA = entrada.nextInt();
		System.out.println("Ingrese el lado 'B': ");
		ladoB = entrada.nextInt();
		System.out.println("Ingrese el lado 'C': ");
		ladoC = entrada.nextInt();
		
		if ( (ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoC + ladoA > ladoB) ) {
			System.out.println("El triangulo es valido.");
			if ((ladoA == ladoB) && (ladoB == ladoC)) {
				System.out.println("El triangulo es equilatero.");
			} else {
				if ( (ladoA != ladoB) && (ladoB != ladoC) && (ladoC != ladoA) ) {
					System.out.println("El triangulo es escaleno.");
				} else {
					System.out.println("El triangulo es isosceles.");
				}
			}
		} else {
			System.out.println("El triangulo no es valido.");
		}
		
	}

}
