import java.util.Scanner;

public class Ej0501_MinMax {
	/* Se ingresan números hasta que se introduce un cero. 
	 * La computadora muestra el máximo y el mínimo. */

	public static void main(String[] args) {

		int num, max = 0, min = 0;
		boolean continuar = true;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese numero (ingrese '0' para detener): ");
		num = entrada.nextInt();
		
		min = num;
		max = num;
		
		if (num == 0) {
			continuar = false;
		} else {
			while (continuar) {
				System.out.println("Ingrese numero (ingrese '0' para detener): ");
				num = entrada.nextInt();
				if (num == 0) {
					continuar = false;
				} else {
					if (num > max) {
						max = num;
					} else {
						if (num < min) {
							min = num;
						}
					}
				}
			}
			
			System.out.println("El maximo fue: " + max + " y el minimo fue: " + min);
			
		}

	}

}