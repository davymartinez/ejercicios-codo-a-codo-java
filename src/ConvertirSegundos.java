import java.util.Scanner;

public class ConvertirSegundos {
    
    public static void main(String[] args) {
                
        int segs, mins, dias, horas;
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese el tiempo en segundos: ");
        segs = entrada.nextInt();
        
        dias = segs / 86400;
        segs = segs % 86400;
        horas = segs / 3600;
        segs = segs % 3600;
        mins = segs / 60;
        segs = segs % 60;
        
        System.out.println("Los segundos ingresados son iguales a: " + dias + " dias, " + horas + " horas, " + mins + " minutos y " + segs + " segundos.");
    
    }
    
}
