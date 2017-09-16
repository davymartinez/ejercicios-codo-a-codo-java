import java.util.Arrays;
import java.util.Scanner;

public class TrabajoPractico_03_CC
{

    public static void main(String[] args)
    {
        char[][] planilla =
        {
            {'P', 'P', 'P', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'T'},
            {'A', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'T', 'P', 'P', 'P', 'A', 'P'},
            {'T', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'A', 'P', 'P'},
            {'P', 'P', 'T', 'T', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
            {'T', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'A', 'P', 'P', 'P', 'A'},
            {'P', 'P', 'P', 'P', 'T', 'T', 'P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'P', 'A'},
            {'P', 'P', 'A', 'P', 'P', 'P', 'T', 'T', 'A', 'P', 'P', 'A', 'P', 'A', 'P', 'P'},
            {'P', 'P', 'P', 'P', 'A', 'A', 'T', 'P', 'P', 'P', 'P', 'A', 'A', 'P', 'P', 'A'},
            {'P', 'P', 'A', 'P', 'A', 'T', 'P', 'P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}
        };
        String[] apellidos = 
        {"Alberti", "Azcuénaga", "Belgrano", "Castelli", "Larrea", "Matheu", "Moreno", "Paso", "Saavedra"};

        switch (menu())
        {
            case 1:
                /* Mostrar alumnos habilitados para rendir final, junto al porcentaje de presentismo de cada uno. */
                mostrarAlumnosHabilitadosParaRendirFinal(planilla, apellidos);
                break;

            case 2:
                /* Mostrar alumnos inhabilitados para rendir final, junto a la cantidad de faltas de cada uno. */
                mostrarAlumnosInhabilitadosParaRendirFinal(planilla, apellidos);
                break;

            case 3:
                /* Mostrar listado de clases con porcentaje de presentismo en cada una. (Las llegadas tarde cuentan como presente). */
                mostrarListadoDeClasesConPresentismo(planilla);
                break;

            case 4:
                /* Mostrar el total de llegadas tarde de toda la cursada en todas las clases. */
                mostrarCantidadDeLlegadasTarde(planilla);
                break;
        }
    }

    static int menu()
    {
        int opcion;
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

        do
        {
            limpiarPantalla();

            System.out.println("Bienvenido al programa");
            System.out.println("");
            System.out.println("[1] Mostrar alumnos habilitados para rendir final");
            System.out.println("[2] Mostrar alumnos inhabilitados para rendir final");
            System.out.println("[3] Listado de presentismo por cada clase");
            System.out.println("[4] Total de llegadas tarde durante la cursada");
            System.out.println("");
            System.out.print("Ingrese opcion: ");
            opcion = entrada.nextInt();
            System.out.println("");

        }
        while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

        return opcion;
    }

    static void mostrarAlumnosHabilitadosParaRendirFinal(char[][] matriz, String[] alumnos)
    {
        int cantidadDeAlumnos = matriz.length;
        int cantidadDeClases = matriz[0].length;

        for (int f = 0; f < cantidadDeAlumnos; f++)
        {
            double faltas = 0;
            double presentismo;
            for (int c = 0; c < cantidadDeClases; c++)
            {
                if (matriz[f][c] == 'A')
                {
                    faltas += 1;
                }
                else
                {
                    if (matriz[f][c] == 'T')
                    {
                        faltas += 0.5;
                    }
                }
            }
            presentismo = calcularPorcentajeDePresentismo(faltas, cantidadDeClases);
            if (presentismo >= 75)
            {
                System.out.println(Arrays.toString(matriz[f]) + ": \t" + presentismo + " %");
            }
        }
    }

    static void mostrarAlumnosInhabilitadosParaRendirFinal(char[][] matriz, String[] alumnos)
    {
        int cantidadDeAlumnos = matriz.length;
        int cantidadDeClases = matriz[0].length;

        for (int f = 0; f < cantidadDeAlumnos; f++)
        {
            double faltas = 0;
            for (int c = 0; c < cantidadDeClases; c++)
            {
                if (matriz[f][c] == 'A')
                {
                    faltas += 1;
                }
                else
                {
                    if (matriz[f][c] == 'T')
                    {
                        faltas += 0.5;
                    }
                }
            }
            if (calcularPorcentajeDePresentismo(faltas, cantidadDeClases) < 75)
            {
                System.out.println(Arrays.toString(matriz[f]) + ": \t" + faltas + " faltas");
            }
        }
    }

    static void mostrarListadoDeClasesConPresentismo(char[][] matriz)
    {
        int cantidadDeAlumnos = matriz.length;
        int cantidadDeClases = matriz[0].length;

        for (int c = 0; c < cantidadDeClases; c++)
        {
            int presentes = 0;
            for (int f = 0; f < cantidadDeAlumnos; f++)
            {
                if (matriz[f][c] == 'P' || matriz[f][c] == 'T')
                {
                    presentes++;
                }
            }
            System.out.println("Clase " + (c + 1) + ": \t" + calcularPorcentajeDePresentismo(presentes, cantidadDeAlumnos) + "%");
        }
    }

    static void mostrarCantidadDeLlegadasTarde(char[][] matriz)
    {
        int cantidadDeAlumnos = matriz.length;
        int cantidadDeClases = matriz[0].length;

        int cantidadDeLlegadasTarde = 0;
        for (int f = 0; f < cantidadDeAlumnos; f++)
        {
            for (int c = 0; c < cantidadDeClases; c++)
            {
                if (matriz[f][c] == 'T')
                {
                    cantidadDeLlegadasTarde++;
                }
            }
        }
        System.out.println("Hubo " + cantidadDeLlegadasTarde + " llegadas tarde");
    }

    static double calcularPorcentajeDePresentismo(int presencias, int cantidadDeClases)
    {
        return (double) presencias / cantidadDeClases * 100;
    }

    static double calcularPorcentajeDePresentismo(double faltas, int cantidadDeClases)
    {
        return (cantidadDeClases - faltas) / cantidadDeClases * 100;
    }

    static void limpiarPantalla()
    {
        // Para limpiar la pantalla, imprimimos 50 saltos de línea
        for (int i = 0; i < 50; i++)
        {
            System.out.println("");
        }
    }
}
