import java.util.Scanner;

public class Ej0404_Fibonacci {

	public static void main(String[] args) {
		/* Dado un número N, la PC muestra los primeros N términos de la sucesión de Ej0404_Fibonacci: 
		 * 1, 1, 2, 3, 5, 8, 13, 21... */
		
		int num, a, b, c, cont;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		a = 0;
		b = 1;
		c = 0;
		cont = 1;
		
		System.out.println("Por favor ingrese la cantidad de terminos a mostrar: ");
		num = entrada.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		while (cont <= (num-2)) {
			c = a+b;
			a = b;
			b = c;
			cont++;
			System.out.println(c);
		}

	}

}
