import java.util.Scanner;

public class Ej0701_04_ArraysMulti_Matriz {
	
	/* Dada la siguiente matriz int[][] matriz = { {1,2,3} , {4,5,6} , {7,8,9} };
	 * realizar los siguientes enunciados (del 7.1 al 7.4):
	 * 7.1) Mostrar la matriz en forma de tabla.
	 * 7.2) Multiplicar todos los valores de la matriz por 2 y mostrar la matriz en forma de tabla.
	 * 7.3) Mostrar la matriz transpuesta.
	 * 7.4) Mostrar los valores de la diagonal principal. */

	public static void main(String[] args) {
		
		int[][] matriz = { {1,2,3}, {4,5,6}, {7,8,9} };
		int opcion;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una opcion del 1 al 4: ");
		opcion = entrada.nextInt();
		
		switch(opcion)
		{
			case 1:
				// Ejercicio 7.1: mostrar matriz en forma de tabla
				System.out.println("Matriz: ");		
				for (int i = 0; i < matriz.length; i++)
				{
					for (int j = 0; j < 3; j++)
					{
						System.out.print(matriz[i][j] + " ");
					}
					System.out.println("");
				}
				break;
			case 2:
				// Ejercicio 7.2: multiplicar todos los valores de la matriz por 2 y mostrar la matriz en forma de tabla.
				System.out.println("Matriz con valores multiplicados por 2: ");
				for (int i = 0; i < matriz.length; i++)
				{
					int[] indice = matriz[i];
					for (int j = 0; j < 3; j++)
					{
						System.out.print(indice[j]*2 + " ");
					}
					System.out.println("");
				}
				break;
			case 3:
				// Ejercicio 7.3: mostrar matriz transpuesta
				System.out.println("Matriz transpuesta: ");		
				for (int i = 0; i < matriz.length; i++)
				{
					for (int j = 0; j < 3; j++)
					{
						System.out.print(matriz[j][i] + " ");
					}
					System.out.println("");
				}
				break;
			case 4:
				// Ejercicio 7.4: mostrar la diagonal principal de la matriz
				System.out.println("Diagonal principal de la matriz: ");		
				for (int i = 0; i < matriz.length; i++)
				{
					for (int j = 0; j < 3; j++)
					{
						if (i == j)
						{
							System.out.print(matriz[i][j] + " ");
						}
					}
				}
				break;
			default:
				System.out.println("Opcion invalida. Por favor ingrese un numero del 1 al 4.");
		}
	
	}

}
