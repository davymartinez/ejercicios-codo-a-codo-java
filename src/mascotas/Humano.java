package mascotas;

public class Humano implements CapazDeComer {
	
	private String nombre;
	private int peso;
	private String comFav;
	
	public Humano(String nombre, int peso, String comFav) {
		this.nombre = nombre;
		this.peso = peso;
		this.comFav = comFav;
	}
	
	@Override
    public void comer() {

    	System.out.println("Hmmm! "+ comFav + "! Mi comida favorita!");
		
	}
	
	@Override
	public String toString() {
		
		return this.nombre + ", " + this.peso + " kg. Su comida favorita es: " + this.comFav;
		
	}

}
