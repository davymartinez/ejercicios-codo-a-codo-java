package geometria2;

public class Cuadrilatero extends FiguraGeometrica {
	
	private int base;
	private int altura;
	
	public Cuadrilatero(int base, int altura) {
		
		super(base, altura);
		this.base = base;
		this.altura = altura;
	
	}

	@Override
	public double calcArea() {
		
		return base * altura;
	
	}

	@Override
	public double calcPerim() {
		
		return (base * 2) * (altura * 2);
	
	}
	
	public void dibujar() {
		
		System.out.println("\n");
		System.out.println("88888888888888888");
		System.out.println("8               8");
		System.out.println("8               8");
		System.out.println("8               8");
		System.out.println("8               8");
		System.out.println("8               8");
		System.out.println("8               8");
		System.out.println("8               8");
		System.out.println("88888888888888888");
		System.out.println("\n");
	        
	}


}