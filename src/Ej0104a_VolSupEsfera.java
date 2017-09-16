import java.util.Scanner;
import java.lang.Math;

public class Ej0104a_VolSupEsfera {
	
	//Dado el valor del radio de una esfera, la computadora muestra el valor de su 
	//superficie y su volumen.
	//Datos de entrada:
	//Radio: real
	//Datos de salida:
	//Superficie: real
	//Volumen: real

	public static void main(String[] args) throws InterruptedException {
		
		//float radio;
		double radio, superficie, volumen;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el valor del radio de la esfera: ");
		radio = entrada.nextFloat();
		System.out.println("Espere un segundo, estamos calculando valores...");
		Thread.sleep(1*1000);
		superficie = 4*Math.PI*(Math.pow(radio,2));
		volumen = (2.0/3.0)*Math.PI*(Math.pow(radio,2))*2*radio;
		System.out.println("Los valores han sido calculados.");
		Thread.sleep(1*1000);
		System.out.println("La superficie de la esfera es: " + superficie);
		System.out.println("El volumen de la esfera es: " + volumen);
	}

}
