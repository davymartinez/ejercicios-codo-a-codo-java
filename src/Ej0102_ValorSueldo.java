import java.util.Scanner;

public class Ej0102_ValorSueldo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el valor de la hora: ");
		
		int valorHora = input.nextInt();
		
		System.out.println("Por favor ingrese la cantidad de horas trabajadas: ");
		
		int cantidadHoras = input.nextInt();
		
		int valorSueldo = valorHora * cantidadHoras;
		
		System.out.println("Su sueldo bruto es: " + valorSueldo);
		
	}

}
