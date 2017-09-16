import java.util.Scanner;
public class Ej0406_NumeroMayor {
	/* Se ingresan 5 números. La computadora muestra cuál fue el mayor y en qué orden 
	 * apareció.
	 * Ejemplo: Se ingresa 4 8 6 7 5, la computadora muestra “8 en la 2º posición”. */

	public static void main(String[] args) {
		
		int contador, numIngresado, numMayor, posicion;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		posicion = 1;
		
		System.out.println("Ingrese el 1° número: ");
		numIngresado = entrada.nextInt();
		numMayor = numIngresado;
		contador = 2;
		
		while (contador <= 5) {
			System.out.println("Ingrese el " + contador + "° número: ");
			numIngresado = entrada.nextInt();
			
			if (numIngresado > numMayor) {
				numMayor = numIngresado;
				posicion = contador;
			}
			
			contador++;
			
		}
		
		System.out.println("El número mayor fue el " + numMayor + " en la " + posicion + "° posición");
		
	}

}
