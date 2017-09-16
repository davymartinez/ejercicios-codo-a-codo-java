package animales2;

public class Main {
	
	public static void main(String[] args) {
		
		Perro a = new Perro("Bully", 3, 5, "American Staffordshire Terrier");
		Perro b = new Perro("Scooby Doo", 2, 25, "Gran Danés");
		
		Gato c = new Gato("Stimpy", 2, 2, "Marrón");
		Gato d = new Gato("Felix", 3, 1, "Blanquinegro");
		
		Perro e = new Perro("Pluto", 4, 20);
		Gato f = new Gato("Garfield", 6, 32, "Naranja");
		
		Canario g = new Canario("Piolin", 3, 1, 1000);
		
		Mascota[] portalDeLasMascotas = {b, g, a, f, c, e, d};
		
		for (int i = 0; i < portalDeLasMascotas.length; i++) {
			portalDeLasMascotas[i].hablar();
		}
		
	}

}
