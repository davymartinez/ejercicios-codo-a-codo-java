import java.util.*;
public class Ej0106_PromNotas {
	
	/* Dadas 3 notas pertenecientes a tres trimestres distintos, la computadora muestra la nota promedio.
	 * Ejemplo: Ingresa 3, 8 y 2, debe devolver 4.33333333. */

	public static void main(String[] args) {
		
		int nota1, nota2, nota3;
		float promedio = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese nota #1: ");
		nota1 = entrada.nextInt();
		System.out.println("Por favor ingrese nota #2: ");
		nota2 = entrada.nextInt();
		System.out.println("Por favor ingrese nota #3: ");
		nota3 = entrada.nextInt();
		
		promedio = (float) (nota1 + nota2 + nota3) / 3;
		
		System.out.println("El promedio de notas es: " + promedio);
		
	}

}
