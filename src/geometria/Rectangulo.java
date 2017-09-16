package geometria;

public class Rectangulo {
	
	private String nombre;
	private int base;
	private int altura;
	
	public Rectangulo(String nombre, int base, int altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void dibujarEnConsola()
    {
        System.out.println("");
        System.out.println("88888888888888888");
        System.out.println("8               8");
        System.out.println("8               8");
        System.out.println("8               8");
        System.out.println("8               8");
        System.out.println("8               8");
        System.out.println("88888888888888888");
    }
	
	public double obtenerPerimetro() {
		return base * 2 + altura * 2;
	}
	
	public double obtenerArea() {
		return base * altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
