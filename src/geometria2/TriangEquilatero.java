package geometria2;

public class TriangEquilatero extends FiguraGeometrica {
	
	private int lado;

	public TriangEquilatero(int lado) {
		
		super(lado);
		this.lado = lado;
		
	}

	@Override
	public double calcArea() {
		
		return (Math.sqrt(3)/4) * (lado*lado);
	
	}

	@Override
	public double calcPerim() {

		return lado * 3;
	}

	@Override
	public void dibujar() {
		
		System.out.println("\n");
		System.out.println("        8");
		System.out.println("       8 8");
		System.out.println("      8   8");
		System.out.println("     8     8");
		System.out.println("    8       8");
		System.out.println("   8         8");
		System.out.println("  8           8");
		System.out.println(" 8             8");
		System.out.println("88888888888888888");
		System.out.println("\n");
		
	}
	
	

}
