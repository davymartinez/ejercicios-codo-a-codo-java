import java.util.Scanner;

import java.lang.String;

public class Ej0301_Calculadora {
	/* Escriba un programa que simule una calculadora b�sica que realice operaciones de 
	 * suma, resta, multiplicaci�n y divisi�n. El programa debe recibir como entrada dos 
	 * n�meros reales y un operador, que puede ser +, -, * � /. La salida del programa 
	 * debe ser el resultado de la operaci�n. */

	public static void main(String[] args) {
		
		double num1, num2, resultado;
		//String operador;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner operador = new Scanner(System.in);
		String op;
		
		System.out.println("Ingrese el primer n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Ingrese el segundo n�mero: ");
		num2 = entrada.nextDouble();
		System.out.println("Ingrese la operaci�n a realizar (+, -, *, /): ");
		op = operador.nextLine();
		
		switch(op) {
			case "+":
				resultado = num1 + num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + resultado);
				break;
			case "-":
				resultado = num1 - num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + resultado);
				break;
			case "*":
				resultado = num1 * num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + resultado);
				break;
			case "/":
				resultado = num1 / num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + resultado);
				break;
			default:
				System.out.println("El operador ingresado no es v�lido.");
				break;
		}

	}

}
