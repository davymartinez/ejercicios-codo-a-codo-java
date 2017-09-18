package geometria2;

public abstract class FiguraGeometrica implements Dibujable {
	
	private String nombre;
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	public FiguraGeometrica(int base, int altura) {
		// constructor
	}

	public FiguraGeometrica(int lado) {
		// constructor
	}

	public String getNombre() {
		return nombre;
	}

    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public abstract double calcArea();
	
	public abstract double calcPerim();
	
	public abstract void dibujar();

}
