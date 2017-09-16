public class Ej0901_ConteoVocalesConsonantes {
	
	/* 9.1) Mostrar la cantidad total de vocales y la cantidad total de consonantes. */

	public static void main(String[] args) {
		
		String cadena = new String("Y cómo huir cuando no quedan islas para naufragar "
				+ "al país donde los sabios se retiran del agravio de buscar "
				+ "labios que sacan de quicio, mentiras que ganan juicios "
				+ "tan sumarios que envilecen "
				+ "el cristal de los acuarios de los peces "
				+ "de ciudad que mordieron el anzuelo, "
				+ "que bucean a ras del suelo, "
				+ "que no merecen nadar.");
		
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0, contVocs = 0, contCons = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a') {
				contA++;
			} else {
				if (cadena.charAt(i) == 'e') {
					contE++;
				} else {
					if (cadena.charAt(i) == 'i') {
						contI++;
					} else {
						if (cadena.charAt(i) == 'o') {
							contO++;
						} else {
							if (cadena.charAt(i) == 'u') {
								contU++;
							} else {
								contCons++;
							}
						}
					}
				}
			}
		}
		
		contVocs = contA + contE + contI + contO + contU;
		
		System.out.println("La cantidad total de vocales es de: " + contVocs);
		System.out.println("La cantidad total de consonantes es de: " + contCons);
		
	}

}
