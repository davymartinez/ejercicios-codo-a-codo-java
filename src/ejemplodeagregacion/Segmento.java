package ejemplodeagregacion;

public class Segmento {
	
	private Punto extremo1;
	private Punto extremo2;
	
	public Segmento(Punto p1, Punto p2) {
		this.extremo1 = p1;
		this.extremo2 = p2;
	}
	
	public double obtenerLongitud() {
		return this.extremo1.calcularDistancia(this.extremo2);
	}

	public Punto getExtremo1() {
		return extremo1;
	}

	public void setExtremo1(Punto extremo1) {
		this.extremo1 = extremo1;
	}

	public Punto getExtremo2() {
		return extremo2;
	}

	public void setExtremo2(Punto extremo2) {
		this.extremo2 = extremo2;
	}

}
