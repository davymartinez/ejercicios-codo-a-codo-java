import java.util.Scanner;

public class PromedioNotas {
    
    public static void main(String[] args) {
        
        int notaSem1, notaSem2, notaSem3;
        float promedio;
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
	
        System.out.println("Por favor ingrese la nota del primer semestre: ");
        notaSem1 = entrada.nextInt();
	
        System.out.println("Por favor ingrese la nota del segundo semestre: ");
        notaSem2 = entrada.nextInt();
	
        System.out.println("Por favor ingrese la nota del tercer semestre: ");
        notaSem3 = entrada.nextInt();
	
        promedio = (notaSem1 + notaSem2 + notaSem3) / 3;
	
        System.out.println("Su promedio de notas es: " + promedio);
        
    }
    
}