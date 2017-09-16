import java.util.Scanner;

public class Ej0302_CarasDelDado {

	public static void main(String[] args) {
		/* Escriba un programa que pida por teclado el resultado (dato entero) obtenido al 
		 * lanzar un dado de seis caras.
		 * Muestre por pantalla el número en letras de la cara opuesta al resultado obtenido.
		 * Disposición de las caras: 1-6, 2-5, 3-4.
		 * Datos de entrada:
		 * lado obtenido: entero
		 * Datos de salida:
		 * lado opuesto: caracter */
		int nroLado;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el lado obtenido en numeros (1 al 6): ");
		nroLado = entrada.nextInt();
		
		switch(nroLado) {
			case 1: 
				System.out.println("El lado opuesto es el seis");
				break;
			case 2: 
				System.out.println("El lado opuesto es el cinco");
				break;
			case 3: 
				System.out.println("El lado opuesto es el cuatro");
				break;
			case 4: 
				System.out.println("El lado opuesto es el tres");
				break;
			case 5: 
				System.out.println("El lado opuesto es el dos");
				break;
			case 6: 
				System.out.println("El lado opuesto es el uno");
				break;
			default:
				System.out.println("El numero ingresado es invalido.");
				break;
		}
	}

}
