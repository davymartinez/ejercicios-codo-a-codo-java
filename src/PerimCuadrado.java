import java.util.Scanner;

public class PerimCuadrado {
    
    public static void main(String[] args) {
        
        double superficie, lado, perimetro; 
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el valor de la superficie en m2");
        
        superficie = entrada.nextFloat();
        lado = Math.sqrt(superficie);
        perimetro = 4 * lado;
        
        System.out.println("El valor del perímetro es: " + perimetro);
    }
}
