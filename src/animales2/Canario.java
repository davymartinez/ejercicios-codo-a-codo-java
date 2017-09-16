package animales2;

public class Canario extends Mascota {
	
	private int volumen;
	
	public Canario(String n, int e, int p, int v) {
		super(n, e, p);
		volumen = v;
	}

	@Override
	public void hablar() {
		System.out.println(super.getNombre() + " dice pio-pio! (con nivel de volumen: " + this.volumen + ")");
	}

}
