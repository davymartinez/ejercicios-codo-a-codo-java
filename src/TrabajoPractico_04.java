import java.util.Scanner;

public class TrabajoPractico_04 {
	
	/* Datos de entrada: cadena de texto a ser analizada
	 * Datos de salida: cadenas "castellano", "inglés" o "alemán" según sea el caso 
	 * Se necesita crear métodos para: 
	 * * Obtener las frecuencias de los caracteres de la cadena recibida
	 * * Determinar si un caracter de la cadena es efectivamente una letra 
	 * * Calcular el porcentaje de ocurrencia de cada caracter de la cadena 
	 * * Calcular el ECM (error cuadrático medio) para determinar probabilidad de cada idioma */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String cadenaIngresada;
		
		System.out.println("Ingrese cadena a analizar: ");
		cadenaIngresada = entrada.nextLine();
		System.out.println("\nProbablemente la cadena esté en el idioma " + predecirIdioma(cadenaIngresada));
		
	}
	
	static String predecirIdioma(String cadenaIngresada) {
		
		// arrays suministrados previamente, asignan a variables double[]
		double[] frecCastellano =
			{ 11.05, 0.87, 6.82, 4.77, 11.93, 1.18, 0.93, 0.37, 8.91, 0.24, 0.01, 5.65, 2.7, 7.41, 9.51, 2.29, 0.78, 
					5.46, 8.14, 5.09, 4.21, 0.76, 0.01, 0.11, 0.7, 0.1 };
		double[] frecIngles =
			{ 7.81, 1.28, 2.93, 4.11, 13.05, 2.88, 1.39, 5.85, 6.77, 0.23, 0.42, 3.6, 2.62, 7.28, 8.21, 2.15, 0.14, 
					6.64, 6.46, 9.02, 2.77, 1, 1.49, 0.3, 1.51, 0.09 };
		double[] frecAleman =
			{ 6.11, 1.87, 2.67, 5.56, 16.51, 1.48, 2.89, 4.15, 8.26, 0.26, 1.67, 3.4, 2.72, 10.28, 3.03, 1.01, 0.02, 
					7.83, 6.27, 6.09, 4.48, 1.08, 1.2, 0.05, 0.08, 1.03 };
		
		// variable de arreglo double[] que almacena resultado de método "obtenerFrecsCadena" sobre la cadena ingresada
		double[] frecCadena = obtenerFrecsCadena(cadenaIngresada);
		
		// variables double para almacenar los resultados de aplicar método "calcularECM" sobre las variables "frecCadena"
		// y cada uno de los arrays de frecuencias por idioma
		double ecmCastellano = calcularECM(frecCadena, frecCastellano);
		double ecmIngles = calcularECM(frecCadena, frecIngles);
		double ecmAleman = calcularECM(frecCadena, frecAleman);
		
		// Se muestran los resultados de cada ECM por idioma, como control
		System.out.println("RESULTADO DE LOS ECM:");
        System.out.println("ECM para el castellano:\t" + ecmCastellano);
        System.out.println("ECM para el inglés:\t" + ecmIngles);
        System.out.println("ECM para el aleman:\t" + ecmAleman);
		
        // bucle if para determinar cuál ECM es menor, lo cual indica la probabilidad de que la cadena sea de un idioma dado
		if (ecmCastellano < ecmIngles && ecmCastellano < ecmAleman) {
			return "Castellano";
		} else if (ecmIngles < ecmCastellano && ecmIngles < ecmAleman) {
			return "Ingles";
		} else {
			return "Aleman";
		}
		
	}
	
	// método para obtener las frecuencias de cada caracter que compone la cadena, el mismo devuelve un array double
	// con frecuencias porcentuales
	static double[] obtenerFrecsCadena(String cadena) {
		
		int[] frecAbsoluta = new int[26]; // arreglo de enteros para almacenar frecuencias de caracteres
		double[] frecPorcentual = new double[26]; // arreglo de doubles para almacenar porcentajes de ocurrencias de chars 
		char caracterExtraido; // variable char para almacenar caracter extraído
		
		cadena = cadena.toUpperCase(); // convertimos toda la cadena recibida a mayúsculas
		
		// lazo for para recorrer la cadena, extraer los caracteres uno a uno y alimentar el array frecAbsoluta
		for (int i = 0; i < cadena.length(); i++) {
			
			caracterExtraido = cadena.charAt(i); // almacenamos cada caracter en la variable caracterExtraido
			
			if (esLetra(caracterExtraido)) {		   // si el caracter es efectivamente una letra (vía método, ver abajo)
				frecAbsoluta[caracterExtraido - 65]++; // se almacena en el array frecAbsoluta, en la posición equivalente
			}										   // a su valor ASCII menos 65 (lo cual lo ubica en una posición entre
		}											   // 0 y 25
		
		frecPorcentual = calcPorcentaje(frecAbsoluta); // se asigna al array frecPorcentual el resultado de aplicar el
													   // método calcPorcentaje al array frecAbsoluta y se devuelve como
													   // resultado del método
		return frecPorcentual;
		
	}
	
	// método para determinar si el caracter extraido de la cadena es una letra (descarta símbolos y números)
	static boolean esLetra(char letra) {
		
		// devuelve true directamente si el caracter está dentro de los siguientes rangos:
		return (letra >= 65 && letra <= 90) || (letra >= 97 && letra <= 122);
		
	}
	
	// método para calcular porcentajes de ocurrencias de caracteres en el arreglo de frecuencias absolutas, el mismo
	// devuelve un arreglo de doubles
	static double[] calcPorcentaje(int[] arreglo) {
		
		int totalLetras = 0; // variable totalizadora de letras
		double[] arregloPorcentual = new double[arreglo.length]; // arreglo de doubles para almacenar porcentajes
		
		for (int i = 0; i < arreglo.length; i++) { // recorremos el arreglo de frecuencias y almacenamos cada elemento del
			totalLetras += arreglo[i];			   // del mismo en la variable totalLetras
		}
		
		for (int i = 0; i < arreglo.length; i++) {						// recorremos de nuevo el arreglo de frecuencias y
			arregloPorcentual[i] = (arreglo[i] * 100.0) / totalLetras;	// almacenamos en array arregloPorcentual el
		}																// resultado de calcular el % de frecuencias
		
		return arregloPorcentual;
		
	}
	
	// método para calcular el error cuadrático medio, toma como parámetros dos arrays: el de frecuencias de caracteres en
	// la cadena y el de frecuencias por idioma; el mismo retorna el valor de ECM, un double
	static double calcularECM(double[] frecCadena, double[] frecIdioma) {
		
		double aux = 0; // variable auxiliar para almacenar valores de función ECM
		double ecm;
		
		for (int i = 0; i < frecCadena.length; i++) {
			aux += (frecIdioma[i] - frecCadena[i]) * (frecIdioma[i] - frecCadena[i]); // fórmula ECM
		}
		
		ecm = aux / (double) frecCadena.length; // el valor del ECM es el cociente de la variable auxiliar entre la
												// longitud del array frecCadena
		
		return ecm;
		
	}
	
}
