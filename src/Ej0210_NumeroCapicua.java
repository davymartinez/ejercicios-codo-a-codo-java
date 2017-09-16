import java.util.Scanner;

public class Ej0210_NumeroCapicua {

    public static void main(String[] args){
    	int numero, capicua, reverso, resto;
    	@SuppressWarnings("resource")
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Por favor, ingrese numero de hasta cuatro cifras: ");
    	numero = entrada.nextInt();
    	
    	capicua = numero;
    	reverso = 0;
    	
    	while (capicua != 0) {
    		resto = capicua % 10;
    		reverso = reverso * 10 + resto;
    		capicua = capicua / 10;
    	}
    	
    	if (reverso == numero) {
    		System.out.println("El numero " + numero + " es capicua");
    	} else {
    		System.out.println("El numero " + numero + " no es capicua");
    	}
    }

}