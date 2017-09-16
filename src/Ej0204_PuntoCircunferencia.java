import java.util.*;

public class Ej0204_PuntoCircunferencia {
	
	/* Dados el valor del radio de un círculo cuyo centro está ubicado en (0;0) y dadas las coordenadas (x;y) de un punto, 
	 * la computadora informa si el punto pertenece o no al círculo.*/

	public static void main(String[] args) {
		
		float r, x, y, xCuad, yCuad;
		double h;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el radio de la circunferencia: ");
		r = entrada.nextFloat();
		System.out.println("Por favor ingrese el coordenada x del punto: ");
		x = entrada.nextFloat();
		System.out.println("Por favor ingrese el coordenada y del punto: ");
		y = entrada.nextFloat();
		
		xCuad = x*x;
		yCuad = y*y;
		h = Math.sqrt(xCuad + yCuad);
		
		if (r >= h) {
			System.out.println("El punto (" + x + ", " + y + ") pertenece a la circunferencia.");
		} else {
			System.out.println("El punto (" + x + ", " + y + ") no pertenece a la circunferencia.");
		}
		
	}

}
