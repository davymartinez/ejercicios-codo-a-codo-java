
package mascotas;

public class Main {

    public static void main(String[] args) {
    	
        // Creamos un par de mascotas de prueba
        Perro a = new Perro("Scooby Doo", 2, 25, "Gran Danés");
        Perro b = new Perro("Pluto", 4, 20);
        Gato c = new Gato("Félix", 3, 17, "Blanquinegro");
        Gato d = new Gato("Garfield", 6, 32, "Naranja");
        Perro e = new Perro("Ayudante de Santa", 2, 14, "Galgo");
        Gato f = new Gato("Bola de nieve II", 4, 20, "Negro");
        Loro g = new Loro("Alex", 2, 1, 80);
        Humano h = new Humano("Messi", 72, "Paella");
        Humano j = new Humano("Max Power", 86, "Tortilla de papas");
        
        // Las guardo en un arreglo en cualquier orden
        CapazDeComer[] portalDeLasMascotas = {b, a, h, f, g, c, j, e, d};
        
        // Aquí se ve al polimorfismo en acción
        for (int i = 0; i < portalDeLasMascotas.length; i++) {
        	
            portalDeLasMascotas[i].comer();
        
        }
    
    }
    
}
