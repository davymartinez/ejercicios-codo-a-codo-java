import java.util.Scanner;

public class Ej0304_SignoZodiaco {

	public static void main(String[] args) {
		/* Escriba un programa que, dado el dato del cumpleaños del usuario (día y mes), 
		 * la computadora diga cuál es su signo del zodíaco.
		 * Ej.: se ingresa 24 y 2, la computadora muestra "PISCIS".
		 * Datos de entrada:
		 * mes, dia: entero
		 * Datos de salida:
		 * signo: caracter */
		int mes, dia;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese su dia de nacimiento: ");
		dia = entrada.nextInt();
		System.out.println("Por favor, ingrese su mes de nacimiento: ");
		mes = entrada.nextInt();
		
		if (dia >= 1 && dia <= 31) {
			switch(mes) {
				case 1:
					if (dia >= 1 && dia <= 20) {
						System.out.println("Su signo es Capricornio.");
					}
					else {
						if (dia >= 21 && dia <= 31) {
							System.out.println("Su signo es Acuario.");
						}
					}
					break;
				case 2:
					if (dia >= 1 && dia <= 19) {
						System.out.println("Su signo es Acuario.");
					}
					else {
						if (dia >= 20 && dia <= 28) {
							System.out.println("Su signo es Piscis.");
						}
						else {
							if (dia > 28) {
								System.out.println("Dia invalido.");
							}
						}
					}
					break;
				case 3:
					if (dia >= 1 && dia <= 20) {
						System.out.println("Su signo es Piscis.");
					}
					else {
						if (dia >= 21 && dia <= 31) {
							System.out.println("Su signo es Aries.");
						}
					}
					break;
				case 4:
					if (dia >= 1 && dia <= 20) {
						System.out.println("Su signo es Aries.");
					}
					else {
						if (dia >= 21 && dia <= 30) {
							System.out.println("Su signo es Tauro.");
						}
						else {
							if (dia > 30) {
								System.out.println("Dia invalido.");
							}
						}
					}
					break;
				case 5:
					if (dia >= 1 && dia <= 20) {
						System.out.println("Su signo es Tauro.");
					}
					else {
						if (dia >= 21 && dia <= 31) {
							System.out.println("Su signo es Geminis.");
						}
					}
					break;
				case 6:
					if (dia >= 1 && dia <= 20) {
						System.out.println("Su signo es Geminis.");
					}
					else {
						if (dia >= 21 && dia <= 30) {
							System.out.println("Su signo es Cancer.");
						}
						else {
							if (dia > 30) {
								System.out.println("Dia invalido.");
							}
						}
					}
					break;
				case 7:
					if (dia >= 1 && dia <= 21) {
						System.out.println("Su signo es Cancer.");
					}
					else {
						if (dia >= 22 && dia <= 31) {
							System.out.println("Su signo es Leo.");
						}
					}
					break;
				case 8:
					if (dia >= 1 && dia <= 21) {
						System.out.println("Su signo es Leo.");
					}
					else {
						if (dia >= 22 && dia <= 31) {
							System.out.println("Su signo es Virgo.");
						}
					}
					break;
				case 9:
					if (dia >= 1 && dia <= 21) {
						System.out.println("Su signo es Virgo.");
					}
					else {
						if (dia >= 22 && dia <= 30) {
							System.out.println("Su signo es Libra.");
						}
						else {
							if (dia > 30) {
								System.out.println("Dia invalido.");
							}
						}
					}
					break;
				case 10:
					if (dia >= 1 && dia <= 21) {
						System.out.println("Su signo es Libra.");
					}
					else {
						if (dia >= 22 && dia <= 31) {
							System.out.println("Su signo es Escorpio.");
						}
					}
					break;
				case 11:
					if (dia >= 1 && dia <= 21) {
						System.out.println("Su signo es Escorpio.");
					}
					else {
						if (dia >= 22 && dia <= 30) {
							System.out.println("Su signo es Sagitario.");
						}
						else {
							if (dia > 30) {
								System.out.println("Dia invalido.");
							}
						}
					}
					break;
				case 12:
					if (dia >= 1 && dia <= 21) {
						System.out.println("Su signo es Sagitario.");
					}
					else {
						if (dia >= 22 && dia <= 31) {
							System.out.println("Su signo es Capricornio.");
						}
					}
					break;
				default:
					System.out.println("Mes ingresado es invalido.");
					break;
			}
		}
		else {
			System.out.println("Dia ingresado es invalido.");
		}
	}

}
