import java.util.Scanner;

public class HolaNombre {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese su nombre: ");
		
		String nombre = input.nextLine();
		
		System.out.println("Hola, " + nombre);
		
	}

}
