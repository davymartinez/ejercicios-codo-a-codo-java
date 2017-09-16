import java.util.Scanner;

public class FibonacciRecursivo {
	
	public static void main(String[] args) {
		/* Escribir la función fibo, que devuelve el n-ésimo término de la sucesión de Fibonacci,
		 * donde n es un entero que se recibe como parámetro.*/
		
		int numero;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el termino de Fibonacci que desee mostrar: ");
		numero = entrada.nextInt();
		
		System.out.println("El " + numero+"-esimo termino de Fibonnaci es: " + fibo(numero));
		
	}
	
	static int fibo(int n) {
		if (n == 0 || n == 1) return n; // sin corchetes!!!
		else return fibo(n-1) + fibo(n-2);
	}
}
