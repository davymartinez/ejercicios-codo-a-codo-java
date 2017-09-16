public class Ej0602_ArrayInverso {

	public static void main(String[] args) {
		/*Se tiene un arreglo de enteros. La computadora muestra sus inversos de atrás para adelante.*/
		
		int[] numeros = {1, 2, 2, 4, 6, 10, 16, 26, 42, 68};
		float[] numInversos = new float[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) 
		{
			numInversos[i] = (float) 1/numeros[i];
		}
		
		for (int j = numInversos.length - 1; j >= 0; j--)
		{
			System.out.print(numInversos[j] + " ");
		}
		
	}
}
