package geometria;

public class Circunferencia {
	
	private String nombre;
	private int radio;
	
	public Circunferencia(String nombre, int radio) {
		this.nombre = nombre;
		this.radio = radio;
	}
	
	public Circunferencia(int radio) {
		this.nombre = "Sin nombre";
		this.radio = radio;
	}
	
	public void dibujarEnConsola()
    {
        System.out.println("");
        System.out.println("      88888");
        System.out.println("   88888888888");
        System.out.println("  8888888888888");
        System.out.println(" 888888888888888");
        System.out.println("88888888888888888");
        System.out.println(" 888888888888888");
        System.out.println("  8888888888888");
        System.out.println("   88888888888");
        System.out.println("      88888");
    }
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double obtenerArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
