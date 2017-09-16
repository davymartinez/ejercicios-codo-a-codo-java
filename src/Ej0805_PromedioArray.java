public class Ej0805_PromedioArray {

	public static void main(String[] args) {
		int[] sueldos = {21, 9, 30, 16, 12};
		int[] edades = {6, 12, 16, 18, 21, 36};
		int[] notas = {11, 13, 17, 19, 15, 11};
		
		System.out.println("El promedio es: " + calcProm(sueldos));
		System.out.println("El promedio es: " + calcProm(edades));
		System.out.println("El promedio es: " + calcProm(notas));
		
	}
	
	static double calcProm(int[] arreglo) {
		
		double acum = 0;
		
		for (int i = 0; i < arreglo.length; i++) {
			acum += arreglo[i];
		}
		
		return acum / arreglo.length;
		
	}

}
