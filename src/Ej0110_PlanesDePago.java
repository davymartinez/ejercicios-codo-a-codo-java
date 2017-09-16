import java.util.Scanner;

public class Ej0110_PlanesDePago {

	/* Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes 
	 * de pago:
	 * Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
	 * Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se 
	 * incrementa en un 10%.
	 * Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se 
	 * incrementa en un 15%. 
	 * Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en 
	 * las primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4 
	 * cuotas. El precio publicado se incrementa en un 25%. 
	 * Dado el precio de un artículo, la computadora muestra los valores a pagar según 
	 * cada plan.
	 * Datos de entrada:
	 * Precio de artículo: real
	 * Datos de salida:
	 * Precio plan 1, Precio plan 2, Cuotas plan 2, Precio plan 3, Cuotas plan 3, Precio 
	 * plan 4, Cuotas plan 4: real */
	
	public static void main(String[] args) {
		
		double precioArt, precioPlan1, precioPlan2, pagoContPlan2, cuotasPlan2, 
			precioPlan3, pagoContPlan3, cuotasPlan3, precioPlan4, cuotas1Plan4, 
			cuotas2Plan4;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese el precio del artículo: ");
		precioArt = entrada.nextDouble();
		
		precioPlan1 = precioArt - (precioArt*0.10);
		precioPlan2 = precioArt + (precioArt*0.10);
		pagoContPlan2 = precioPlan2*0.50;
		cuotasPlan2 = precioPlan2*0.25;
		precioPlan3 = precioArt + (precioArt*0.15);
		pagoContPlan3 = precioPlan3*0.25;
		cuotasPlan3 = precioPlan3*0.15;
		precioPlan4 = precioArt + (precioArt*0.25);
		cuotas1Plan4 = precioPlan4*0.15;
		cuotas2Plan4 = precioPlan4*0.10;
		
		System.out.println("Los precios por plan son como sigue: ");
		System.out.println("Plan 1: $" + precioPlan1);
		System.out.println("Plan 2: $" + precioPlan2 + ", cancelando $" + pagoContPlan2 
				+ " de contado y 2 cuotas de $" + cuotasPlan2 + " c/u");
		System.out.println("Plan 3: $" + precioPlan3 + ", cancelando $" + pagoContPlan3 
				+ " de contado y 5 cuotas de $" + cuotasPlan3 + " c/u");
		System.out.println("Plan 4: $" + precioPlan4 + ", 4 cuotas de $" + cuotas1Plan4
				+ " c/u y 4 cuotas de $" + cuotas2Plan4 + " c/u");

	}

}
