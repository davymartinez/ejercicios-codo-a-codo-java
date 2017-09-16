import java.util.Scanner;

public class TrabajoPractico_03 {
    
    /* Cada arreglo representa un alumno cuya posición coincide con la del segundo arreglo 
     * de apellidos. Una P significa "Presente". Una T significa "Tarde". Una A significa 
     * "Ausente". Un ausente suma una falta completa. Las llegadas tarde suman media falta.
     * La condición para examen final es haber obtenido una asistencia mayor o igual al 75%. */
    
    public static void main(String[] args) {
                
        menu();
                
    }
    
    static void menu() {
    	char[][] listado = { 
                {'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'T' },
                {'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'A', 'P' },
                {'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P' },
                {'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
                {'T', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'P', 'A' },
                {'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'P', 'A' },
                {'P', 'P', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A', 'P', 'A', 'P', 'P' },
                {'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A', 'A', 'P', 'P', 'A' },
                {'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P' } 
            };
        String[] alumnos = {"Alberti", "Azcuenaga", "Belgrano", "Castelli", "Larrea", 
            				"Matheu", "Moreno", "Paso", "Saavedra"};
    	@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
    	int opcion;
    	
    	do {	
        	limpiarPantalla();
        	
        	System.out.println("Por favor, seleccione una opcion: ");
            System.out.println("1 - Mostrar alumnos habilitados para rendir final y sus porcentajes de asistencia");
            System.out.println("2 - Mostrar alumnos inhabilitados para rendir final y cantidad de ausencias");
            System.out.println("3 - Mostrar listado de clases con porcentaje de asistencias en cada una");
            System.out.println("4 - Mostrar el total de llegadas tarde de toda la cursada en todas las clases");
            System.out.print("Su opcion: ");
            opcion = entrada.nextInt();
            System.out.println("");
        
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);
        
        switch(opcion) {
        	
        	case 1:
        		alumnosHabilitados(alumnos, listado);
        		break;
                
        	case 2:
        		alumnosInhabilitados(alumnos, listado);
                break;
        	
        	case 3:
        		listadoClases(listado);
                break;
        	
        	case 4:
        		llegadasTarde(listado);
                break;
        	
        	default:
        		System.out.println("La opcion ingresada es invalida. Por favor ingrese un numero del 1 al 4.");
        	
        }
    }
    
    static void limpiarPantalla() {
    	for (int i = 0; i <= 50; i++) {
    		System.out.println("");
    	}
    }
    
    static void alumnosHabilitados(String[] alumnos, char[][] listado) {
    	/* Opcion #1: Mostrar alumnos habilitados para rendir final, junto al porcentaje de 
         * presentismo de cada uno */
        for (int i = 0; i < alumnos.length; i++) { //recorremos el array de alumnos
        	double p, t, porcentP;
        	boolean estaHabilitado;
            String habilitado;
        	p = 0; //reiniciamos las variables por cada alumno
        	t = 0;
        	porcentP = 0;
        	estaHabilitado = true;
        	for (int j = 0; j < listado[i].length; j++) { // recorremos la fila i del listado
        		if (listado[i][j] == 'P') {
        			p++;
        		} else {
        			if (listado[i][j] == 'T') {
        				t++;
        			}
        		}
        	}
        	porcentP = ((p + (t * 0.5)) / listado[i].length) * 100;
        	
        	if (porcentP < 75) {
        		habilitado = "No Habilitado";
        		estaHabilitado = false;
        	} else {
        		habilitado = "Habilitado";
        	}
        	
        	if (estaHabilitado) {
        		System.out.println(alumnos[i] + " | % Presentismo: " + porcentP + " | ["+habilitado+"]");
        	}
        }
    }
    
    static void alumnosInhabilitados(String[] alumnos, char[][] listado) {
    	/* Opcion #2: Mostrar alumnos inhabilitados para rendir final, 
    	 * junto a la cantidad de faltas de cada uno */
        for (int i = 0; i < alumnos.length; i++) { //recorremos el array de alumnos
        	double p = 0, t = 0, a = 0, porcentP = 0, ausTotales = 0;
        	boolean estaInhabilitado = false;
            String habilitado;
        	for (int j = 0; j < listado[i].length; j++) { // recorremos la fila i del listado
        		if (listado[i][j] == 'P') {
        			p++;
        		} else {
        			if (listado[i][j] == 'T') {
        				t++;
        			}
        			else {
        				if (listado[i][j] == 'A') {
        					a++;
        				}
        			}
        		}
        	}
        	porcentP = ((p + (t * 0.5)) / listado[i].length) * 100;
        	ausTotales = a + (t / 2);
        	
        	if (porcentP < 75) {
        		habilitado = "No Habilitado";
        		estaInhabilitado = true;
        	} else {
        		habilitado = "Habilitado";
        	}
        	
        	if (estaInhabilitado) {
        		System.out.println(alumnos[i] + " | Nro. de Ausencias: " + ausTotales + " | ["+habilitado+"]");
        	}
        	        	
        }
    }
    
    static void listadoClases(char[][] listado) {
    	/* Opcion #3: Mostrar listado de clases con porcentaje de presentismo en cada una. */
        int cantAlumnos = listado.length;
        int cantClases = listado[0].length;
        
        for (int c = 0; c < cantClases; c++) {
        	int presentes = 0;
        	for (int f = 0; f < cantAlumnos; f++) {
        		if (listado[f][c] == 'P' || listado[f][c] == 'T') {
        			presentes++;
        		}
        	}
        	System.out.println("Clase " + (c + 1) + ": \t" + ((double) presentes / cantClases) * 100 + "%");
        }
    }
    
    static void llegadasTarde(char[][] listado) {
    	/* Opcion #4: Mostrar el total de llegadas tarde de toda la cursada en todas las 
         * clases */        
        int cont = 0;
        
        for (int f = 0; f < listado.length; f++) {
            for (int c = 0; c < listado[0].length; c++) {
                if (listado[f][c] == 'T') {
                    cont++;
                }
            }
        }
        
        System.out.println("La cantidad total de llegadas tarde fue de: " + cont);
    }
    
}