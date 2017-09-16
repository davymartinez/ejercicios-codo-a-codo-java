public class Ej0904_LongPromPalabras {
	
	/* 9.4) Mostrar la longitud promedio de las palabras que contiene la cadena */
	
	public static void main (String[] args) {
		
		String cadena = new String("Y cómo huir cuando no quedan islas para naufragar "
				+ "al país donde los sabios se retiran del agravio de buscar "
				+ "labios que sacan de quicio, mentiras que ganan juicios "
				+ "tan sumarios que envilecen "
				+ "el cristal de los acuarios de los peces "
				+ "de ciudad que mordieron el anzuelo, "
				+ "que bucean a ras del suelo, "
				+ "que no merecen nadar.");
		
		int contEspacs = 0, contPalabs = 0; 
		double promCars = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				contEspacs++;
			}
		}
		
		contPalabs = contEspacs + 1;
		promCars = cadena.length() / contPalabs;
		
		System.out.println("Longitud promedio de palabras en la cadena: " + promCars);
		
	}
		
}
