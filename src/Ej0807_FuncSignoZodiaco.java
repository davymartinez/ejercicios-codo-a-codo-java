import java.util.Scanner;

public class Ej0807_FuncSignoZodiaco {
	
	public static void main(String[] args) {
		/* Escriba un programa que, dado el dato del cumpleaños del usuario (día y mes), 
		 * la computadora diga cuál es su signo del zodiaco. 
		 * Ejemplo: Se ingresa 24 y 2, la computadora muestra “PISCIS”. */
		
		int mes, dia;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese su dia de nacimiento: ");
		dia = entrada.nextInt();
		System.out.println("Por favor, ingrese su mes de nacimiento: ");
		mes = entrada.nextInt();
		
		fechaIngr(dia, mes);
			
	}
	
	static void fechaIngr(int dia, int mes) {
		if (dia >= 1 && dia <= 31) {
			switch(mes) {
				case 1:
					ene(dia);
					break;
				case 2:
					feb(dia);
					break;
				case 3:
					mar(dia);
					break;
				case 4:
					abr(dia);
					break;
				case 5:
					may(dia);
					break;
				case 6:
					jun(dia);
					break;
				case 7:
					jul(dia);
					break;
				case 8:
					ago(dia);
					break;
				case 9:
					sep(dia);
					break;
				case 10:
					oct(dia);
					break;
				case 11:
					nov(dia);
					break;
				case 12:
					dic(dia);
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
	
	static void ene(int dia) {
		if (dia >= 1 && dia <= 20) {
			System.out.println("Su signo es Capricornio.");
		}
		else {
			if (dia >= 21 && dia <= 31) {
				System.out.println("Su signo es Acuario.");
			}
		}
	}
	
	static void feb(int dia) {
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
	}
	
	static void mar(int dia) {
		if (dia >= 1 && dia <= 20) {
			System.out.println("Su signo es Piscis.");
		}
		else {
			if (dia >= 21 && dia <= 31) {
				System.out.println("Su signo es Aries.");
			}
		}
	}
	
	static void abr(int dia) {
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
	}
	
	static void may(int dia) {
		if (dia >= 1 && dia <= 20) {
			System.out.println("Su signo es Tauro.");
		}
		else {
			if (dia >= 21 && dia <= 31) {
				System.out.println("Su signo es Geminis.");
			}
		}
	}
	
	static void jun(int dia) {
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
	}
	
	static void jul(int dia) {
		if (dia >= 1 && dia <= 21) {
			System.out.println("Su signo es Cancer.");
		}
		else {
			if (dia >= 22 && dia <= 31) {
				System.out.println("Su signo es Leo.");
			}
		}
	}
	
	static void ago(int dia) {
		if (dia >= 1 && dia <= 21) {
			System.out.println("Su signo es Leo.");
		}
		else {
			if (dia >= 22 && dia <= 31) {
				System.out.println("Su signo es Virgo.");
			}
		}
	}
	
	static void sep(int dia) {
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
	}
	
	static void oct(int dia) {
		if (dia >= 1 && dia <= 21) {
			System.out.println("Su signo es Libra.");
		}
		else {
			if (dia >= 22 && dia <= 31) {
				System.out.println("Su signo es Escorpio.");
			}
		}
	}
	
	static void nov(int dia) {
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
	}
	
	static void dic(int dia) {
		if (dia >= 1 && dia <= 21) {
			System.out.println("Su signo es Sagitario.");
		}
		else {
			if (dia >= 22 && dia <= 31) {
				System.out.println("Su signo es Capricornio.");
			}
		}
	}

}
