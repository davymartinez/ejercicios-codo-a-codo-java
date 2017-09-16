package geometria;

public class TrianguloEquilatero {
	
	private String nombre;
	private int lado;
	
	public TrianguloEquilatero(String nombre, int lado) {
		this.nombre = nombre;
		this.lado = lado;
	}
	
	public TrianguloEquilatero(int lado) {
		this.nombre = "Sin nombre";
		this.lado = lado;
	}
	
	public void dibujarEnConsola()
	{
		System.out.println("");
		System.out.println("        8");
		System.out.println("       888 ");
		System.out.println("      88888");
		System.out.println("     8888888");
		System.out.println("    888888888 ");
		System.out.println("   88888888888");
		System.out.println("  8888888888888");
		System.out.println(" 888888888888888");
		System.out.println("88888888888888888");
	}
	
	public double obtenerPerimetro() {
		return lado * 3;
	}
	
	public double obtenerArea() {
		return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
