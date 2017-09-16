import java.util.Scanner;

public class ArregloPromNotas2 {
    
    /* Usuario indica cuantas notas va a cargar.
     * Se van cargando en un array.
     * Se muestran notas sin aplazos. */
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de notas: ");
        
        int tam = entrada.nextInt();
        int[] notas = new int[tam];
        int suma = 0;
        int contAprob = 0;
        double promSinAplazos;
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("Ingrese nota " + (i+1));
            notas[i] = entrada.nextInt();
            if (notas[i] >= 4 ) {
                suma += notas[i];
                contAprob++;
            } 
        }
        
        promSinAplazos = (double) suma/contAprob;
        
        System.out.println("El promedio de notas es: " + promSinAplazos);
        
    }
    
}