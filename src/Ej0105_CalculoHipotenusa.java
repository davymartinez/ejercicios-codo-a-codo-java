import java.util.Scanner;

/* Dados dos valores para cada cateto de un triángulo rectángulo, la computadora
    calcula y muestra el valor de la hipotenusa.
    Valores de entrada:
    Cateto a: real
    Cateto b: real
    Valor de salida:
    Hipotenusa: real */

public class Ej0105_CalculoHipotenusa {
    
    public static void main(String[] args) {
        
        double a, b, hipotenusa;
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese el valor del cateto a: ");
        a = entrada.nextDouble();
        
        System.out.println("Por favor, ingrese el valor del cateto b: ");
        b = entrada.nextDouble();
        
        hipotenusa = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    
    }

}