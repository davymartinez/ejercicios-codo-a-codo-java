import java.util.Scanner;

public class Ej0206_AlumnosYSillas {

	public static void main(String[] args) {
		/* Dada la cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
		 * computadora indica si alcanzan las sillas, en caso contrario, indica cuántas faltan 
		 * para que todo el alumnado tenga asiento. 
		 * Datos: 
		 * cantidad de alumnos, cantidad de sillas: entero
		 * alcanzan sillas: cadena
		 * sillas faltantas: entero */
		
		int cantAlumnos, cantSillas, sillasFalt;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos del curso: ");
		cantAlumnos = entrada.nextInt();
		System.out.println("Ingrese la cantidad de sillas en el curso: ");
		cantSillas = entrada.nextInt();
		
		sillasFalt = cantSillas - cantAlumnos;
		
		if (sillasFalt >= 0) {
			System.out.println("No faltan sillas.");
		} 
		else {
			if (sillasFalt < 0) {
				System.out.println("Faltan " + (sillasFalt * (-1)) + " sillas.");
			}
		}

	}

}
