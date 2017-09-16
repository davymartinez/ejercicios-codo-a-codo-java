import java.util.Scanner;

public class TrabajoPractico_04_CC
{

    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        String cadenaIngresada;

        System.out.println("Ingrese una cadena para predecir en qué idioma está escrita: ");
        cadenaIngresada = entrada.nextLine();
        System.out.println("\nProbablemente la cadena esté escrita en " + predecirIdioma(cadenaIngresada) );
    }

    static String predecirIdioma (String cadena)
    {
        // Tenemos los valores esperados de frecuencia (en %) para cada idioma
        double[] frecCastellano = {11.05,0.87,6.82,4.77,11.93,1.18,0.93,0.37,8.91,0.24,0.01,5.65,2.7,7.41,9.51,2.29,0.78,5.46,8.14,5.09,4.21,0.76,0.01,0.11,0.7,0.1};
        double[] frecIngles = {7.81,1.28,2.93,4.11,13.05,2.88,1.39,5.85,6.77,0.23,0.42,3.6,2.62,7.28,8.21,2.15,0.14,6.64,6.46,9.02,2.77,1,1.49,0.3,1.51,0.09};
        double[] frecAleman = {6.11,1.87,2.67,5.56,16.51,1.48,2.89,4.15,8.26,0.26,1.67,3.4,2.72,10.28,3.03,1.01,0.02,7.83,6.27,6.09,4.48,1.08,1.2,0.05,0.08,1.03};

        // Tenemos los valores esperados de frecuencia (en %) para la cadena ingresada
        double[] frecCadena = obtenerFrecuenciaDeCaracteres(cadena);

        // Calculamos el Error Cuadrático Medio para cada uno de los idiomas
        double ecmCastellano = calcularECM(frecCadena, frecCastellano);
        double ecmIngles = calcularECM(frecCadena, frecIngles);
        double ecmAleman = calcularECM(frecCadena, frecAleman);

        // Muestro los resultados para controlar (en la versión final no deberían salir)
        ////////////////////////////////////////////////////////////////////////////////
        System.out.println("RESULTADO DE LOS ECM:");
        System.out.println("ECM para el castellano:\t" + ecmCastellano);
        System.out.println("ECM para el inglés:\t" + ecmIngles);
        System.out.println("ECM para el aleman:\t" + ecmAleman);
        ////////////////////////////////////////////////////////////////////////////////


        // El ECM más pequeño es el que probablemente defina el idioma
        if (ecmCastellano < ecmIngles && ecmCastellano < ecmAleman)
        {
            return "CASTELLANO";
        }
        else if (ecmIngles < ecmCastellano && ecmIngles < ecmAleman)
        {
            return "INGLES";
        }
        else
        {
            return "ALEMAN";
        }
    }

    static double[] obtenerFrecuenciaDeCaracteres (String cadena)
    {
        // Declaramos dos arreglos de 26 posiciones (total de letras del abecedario sin ñ)
        int[] frecuenciaAbsoluta = new int[26];
        double[] frecuenciaPorcentual = new double[26];
        char caracterExtraido;

        cadena = cadena.toUpperCase(); // Todo a mayúsculas para evitar tantas posibilidades

        System.out.println("\nLa cadena que realmente se tuvo en cuenta:");

        for (int i = 0; i < cadena.length(); i++)
        {
            caracterExtraido = cadena.charAt(i);
            if ( esLetra( caracterExtraido ) )
            {
                System.out.print(caracterExtraido); // Muestro los caracteres que se van extrayendo para controlar (en la versión final no deberían salir)
                frecuenciaAbsoluta[ caracterExtraido - 65 ]++; // Como los caracteres son números, aprovecho esa ventaja y accedo al arreglo con una pequeña fórmula
            }
        }

        System.out.println(""); // SALTO DE LINEA

        frecuenciaPorcentual = calcularPorcentajes(frecuenciaAbsoluta);

        // Muestro los resultados para controlar (en la versión final no deberían salir)
        ////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nLetra\t\tFrec abs.\t\tFrec %");
        for (int i = 0; i < frecuenciaAbsoluta.length; i++)
        {
            System.out.print( ((char) (i + 65)) + "\t\t");
            System.out.print(frecuenciaAbsoluta[i] + " veces \t\t");
            System.out.println(frecuenciaPorcentual[i] + "%");
        }
        System.out.println("");
        ////////////////////////////////////////////////////////////////////////////////

        return frecuenciaPorcentual;
    }

    static boolean esLetra (char letra)
    {
        // A - Z (De 65 a 90)    o    a - z (De 97 a 122)
        return (letra >= 65 && letra <= 90) || (letra >= 97 && letra <= 122);
    }

    static double[] calcularPorcentajes (int[] arreglo)
    {
        int totalLetras = 0;
        // Creamos un nuevo arreglo del mismo tamaño que el que llega por parámetro
        double[] arregloConPorcentaje = new double[arreglo.length];

        for (int i = 0; i < arreglo.length; i++)
        {
          totalLetras += arreglo[i]; // Acumulo valores
        }

        for (int i = 0; i < arreglo.length; i++)
        {
          // Guardo en cada posición el equivalente en porcentaje
          arregloConPorcentaje[i] = (arreglo[i] * 100.0) / totalLetras;
        }

        return arregloConPorcentaje;
    }

    static double calcularECM (double[] frecCadena, double[] frecLenguaje)
    {
      double aux = 0;
      double ecm;

      // El ECM se define como la diferencia entre la predicción y lo obtenido.
      
      for (int i = 0; i < frecCadena.length; ++i)
      {
        aux += (frecLenguaje[i] - frecCadena[i]) * (frecLenguaje[i] - frecCadena[i]);
      }

      ecm = aux / (double) frecCadena.length;

      return ecm;
    }
}
