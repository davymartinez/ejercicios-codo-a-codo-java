import java.util.Scanner;

public class PerimSuperfTriangulo {
    
    public static void main(String[] args) {
        
        double ladoA, ladoB, ladoC, perimetro, semip, superficie;
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese la medida del lado a: ");
        ladoA = entrada.nextDouble();
        
        System.out.println("Por favor, ingrese la medida del lado b: ");
        ladoB = entrada.nextDouble();
        
        System.out.println("Por favor, ingrese la medida del lado c: ");
        ladoC = entrada.nextDouble();
        
        perimetro = ladoA + ladoB + ladoC;
        
        System.out.println("El perimetro calculado es igual a: " + perimetro);
        
        semip = perimetro / 2;
        superficie = Math.sqrt(semip*(semip-ladoA)*(semip-ladoB)*(semip-ladoC));
        
        System.out.println("La superficie del triángulo es igual a: " + superficie);
        
    }
}
