import java.util.Scanner;

public class Ej0603_ArraySinRepetidos {

	public static void main(String[] args) {
		/* Se ingresan 10 números. La computadora los muestra eliminando las repeticiones.*/
		
		int[] arreglo = new int[10];
		boolean esRepetido = false;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < arreglo.length; i++)
		{
			System.out.println("Ingrese el numero #" + (i+1) + " : ");
			arreglo[i] = entrada.nextInt();
		}
		
		for (int j = 0; j < arreglo.length; j++)
		{
			esRepetido = false;
			for (int k = 0; k < j; k++)
			{
				if (arreglo[j] == arreglo[k])
				{
					esRepetido = true;
					break;
				}
			}
			if (!esRepetido)
			{
				System.out.print(arreglo[j] + " ");
			}
		}

	}

}
