public class Ej0903_EncierraPreposiciones {
	
	/* 9.3) Mostrar la cadena con las preposiciones encerradas entre asteriscos */

	public static void main(String[] args) {
		
		String cadena = new String("Y c�mo huir cuando no quedan islas para naufragar "
				+ "al pa�s donde los sabios se retiran del agravio de buscar "
				+ "labios que sacan de quicio, mentiras que ganan juicios "
				+ "tan sumarios que envilecen "
				+ "el cristal de los acuarios de los peces "
				+ "de ciudad que mordieron el anzuelo, "
				+ "que bucean a ras del suelo, "
				+ "que no merecen nadar.");
		
		cadena = cadena.replaceAll(" a ", " *a* ");
		cadena = cadena.replaceAll(" de ", " *de* ");
		cadena = cadena.replaceAll(" para ", " *para* ");
		
		System.out.println(cadena);
	}

}
