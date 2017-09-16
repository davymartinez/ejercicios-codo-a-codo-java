import java.util.Scanner;

public class Ej0203_CocienteYResto {

	public static void main(String[] args) {
		/* Se ingresan dos números enteros. La computadora muestra su cociente entero.
		 * Si hubiere resto, mostrarlo en otra línea.
		 * Datos de entrada: numero 1, numero 2: entero
		 * Datos de salida: cociente, resto: real */
		int num1, num2;
		double cociente, resto;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresar primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Ingresar segundo numero: ");
		num2 = entrada.nextInt();
		
		cociente = num1/num2;
		resto = num1 % num2;
		
		System.out.println("El cociente entero es igual a: " + cociente);
		
		if (resto != 0) {
			System.out.println("El resto es igual a: " + resto);
		}
		
	}

}
