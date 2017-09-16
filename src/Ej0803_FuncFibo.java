import java.util.Scanner;

public class Ej0803_FuncFibo {

	public static void main(String[] args) {
		/* Escribir la funci�n fibo, que devuelve el n-�simo t�rmino de la sucesi�n de Fibonacci,
		 * donde n es un entero que se recibe como par�metro.*/
		
		int numero;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el termino de Fibonacci que desee mostrar: ");
		numero = entrada.nextInt();
		
		System.out.println("El " + numero+"-esimo termino de Fibonnaci es: " + fibo(numero));
		
	}
	
	static int fibo(int n) {
		int a = 0, b = 1, c = 0, cont = 1;
		while (cont <= (n-2)) 
		{
			c = a+b;
			a = b;
			b = c;
			cont++;
		}
		return c;
	}

}
