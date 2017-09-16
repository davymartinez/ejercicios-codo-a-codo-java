public class Ej0601_ArrayCuadrados {
	/* Se tiene un arreglo de enteros. La computadora muestra sus valores al cuadrado. */
	
	public static void main(String[] args) {
		
		int[] numeros = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]*numeros[i] + " ");
		}
		
	}

}
