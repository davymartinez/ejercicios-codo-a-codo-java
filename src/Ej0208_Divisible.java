import java.util.Scanner;

public class Ej0208_Divisible {

	public static void main(String[] args) {
		/* Dados dos números enteros, la computadora indica si el mayor es divisible por el 
		 * menor.
		 * Datos de entrada:
		 * número 1, número 2: enteros
		 * Datos de salida:
		 * es divisible: cadena */
		int num1, num2;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese el primer número: ");
		num1 = entrada.nextInt();
		System.out.println("Por favor, ingrese el segundo número: ");
		num2 = entrada.nextInt();
		
		if (num1 > num2 && num1 % num2 == 0) {
			System.out.println(num1 + " es divisible por " + num2);
		} 
		else {
			if (num2 > num1 && num2 % num1 == 0) {
				System.out.println(num2 + " es divisible por " + num1);
			}
			else {
				System.out.println("Los numeros no son divisibles entre si.");
			}
		}
	}

}
