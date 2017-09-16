import java.util.Scanner;

public class Ej0502_IngresarNotas {

	public static void main(String[] args) {
		/* Se ingresan notas numéricas de 0 a 10. El proceso de carga finaliza cuando se
		 * detecta un número fuera de rango (negativo o mayor que 10). La computadora
		 * muestra el promedio de las notas.*/
		int nota = 0, sumatoria = 0, contador = 0, promedio = 0;
		boolean continuar = true;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		while (continuar)
		{
			System.out.println("Ingrese nota de 0 a 10 (ingresar numero negativo o mayor a 10 para detener): ");
			nota = entrada.nextInt();
			if (nota < 0 || nota > 10)
			{
				continuar = false;
			}
			sumatoria += nota;
			contador++;
		}
		promedio = sumatoria / contador;
		System.out.println("El promedio de notas fue de: " + promedio);
	}

}