import java.util.Scanner;

public class Ej0103_CalcularAngulos {

	//Dados los valores de dos de los ángulos interiores de un triángulo, 
	//la computadora muestra el valor del restante.
	//Datos de entrada:
	//Angulo interior 1: real
	//Angulo interior 2: real
	//Datos de salida:
	//Angulo restante: real
	
	public static void main(String[] args) {
		
		float ang1, ang2, angRest;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese el primer ángulo");
		ang1 = entrada.nextFloat();
		System.out.println("Por favor, ingrese el segundo ángulo");
		ang2 = entrada.nextFloat();
		angRest = 180-ang1-ang2;
		System.out.println("El valor del ángulo restante es: " + angRest);
	}

}