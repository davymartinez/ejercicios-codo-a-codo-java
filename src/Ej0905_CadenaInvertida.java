public class Ej0905_CadenaInvertida {
	
	/* 9.5) Mostrar la cadena invertida */
	
	public static void main (String[] args) {
		
		String cadena = new String("Y c�mo huir cuando no quedan islas para naufragar "
				+ "al pa�s donde los sabios se retiran del agravio de buscar "
				+ "labios que sacan de quicio, mentiras que ganan juicios "
				+ "tan sumarios que envilecen "
				+ "el cristal de los acuarios de los peces "
				+ "de ciudad que mordieron el anzuelo, "
				+ "que bucean a ras del suelo, "
				+ "que no merecen nadar.");
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}

	}
}