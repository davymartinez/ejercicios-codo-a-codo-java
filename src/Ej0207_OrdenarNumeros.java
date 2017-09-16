import java.util.Scanner;

public class Ej0207_OrdenarNumeros {

	public static void main(String[] args) {
		/* Se ingresan tres números. La computadora los muestra ordenados de menor a mayor.
		 * Datos de entrada:
		 * numeros: real
		 * Datos de salida:
		 * numeros ordenados: real */
		
		int a, b, c;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el primer número: ");
		a = entrada.nextInt();
		System.out.println("Por favor ingrese el segundo número: ");
		b = entrada.nextInt();
		System.out.println("Por favor ingrese el tercer número: ");
		c = entrada.nextInt();
		
		if (a < b && b < c) {
			System.out.println("'Los números, ordenados de menor a mayor son: "+a+", "+b+" y "+c);
		}
		else {
			if (a < c && c < b) {
				System.out.println("'Los números, ordenados de menor a mayor son: "+a+", "+c+" y "+b);
			}
			else {
				if (b < a && a < c) {
					System.out.println("'Los números, ordenados de menor a mayor son: "+b+", "+a+" y "+c);
				}
				else {
					if (b < c && c < a) {
						System.out.println("'Los números, ordenados de menor a mayor son: "+b+", "+c+" y "+a);
					}
					else {
						if (c < a && a < b) {
							System.out.println("'Los números, ordenados de menor a mayor son: "+c+", "+a+" y "+b);
						}
						else {
							System.out.println("'Los números, ordenados de menor a mayor son: "+c+", "+b+" y "+a);
						}
					}
				}
			}
		}

	}

}
