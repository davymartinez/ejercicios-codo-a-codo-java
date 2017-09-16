import java.util.Scanner;

public class Ej0807b_FuncSignoZodiacoCC {

	public static void main(String[] args) {
		
		int dia;
		int mes;
		
		dia = obtenerEntero("el dia");
		mes = obtenerEntero("el mes");
		
		mostrarSigno(dia, mes); //also mostrarSigno(obtenerEntero(dia), obtenerEntero(mes))
		
	}
	
	static int obtenerEntero(String x) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese " + x + ": ");
		return entrada.nextInt();
	}
	
	static boolean validarFecha(int dia, int mes) {
		
		return ( ((dia >= 1 && dia <= 28) && mes == 2) 
				|| ((dia >= 1 && dia <= 30) && mes == 4 || mes == 6 || mes == 9 || mes == 11) 
				|| ((dia >= 1 && dia <= 31) && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12) );
		
	}
	
	static void mostrarSigno(int dia, int mes) {
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
