package ejemplodeagregacion;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void trasladar(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double calcularDistancia(Punto p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	@Override
	public String toString() {
		return this.x + " ; " + this.y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	

}
