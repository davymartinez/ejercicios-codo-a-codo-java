import java.util.Scanner;

import java.lang.String;

public class Ej0301_Calculadora {
	/* Escriba un programa que simule una calculadora básica que realice operaciones de 
	 * suma, resta, multiplicación y división. El programa debe recibir como entrada dos 
	 * números reales y un operador, que puede ser +, -, * ó /. La salida del programa 
	 * debe ser el resultado de la operación. */

	public static void main(String[] args) {
		
		double num1, num2, resultado;
		//String operador;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner operador = new Scanner(System.in);
		String op;
		
		System.out.println("Ingrese el primer número: ");
		num1 = entrada.nextDouble();
		System.out.println("Ingrese el segundo número: ");
		num2 = entrada.nextDouble();
		System.out.println("Ingrese la operación a realizar (+, -, *, /): ");
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
				System.out.println("El operador ingresado no es válido.");
				break;
		}

	}

}
