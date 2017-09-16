import java.util.Scanner;

public class ConvertirFaC {
    
    public static void main(String[] args) {
        
        double gradC, gradF;
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la temperatura en grados Fahrenheit: ");
        
        gradF = entrada.nextDouble();
        gradC = (gradF - 32.0)/1.8;
        
        System.out.println(gradF + " grados Fahrenheit son " + String.format("%.2f",gradC) + " grados centigrados.");
    }
}
