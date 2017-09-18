package geometria2;

public class Circulo extends FiguraGeometrica {
	
	private int radio;
	
	public Circulo(int radio) {
		
		super(radio);
		this.radio = radio;
		
	}

	@Override
	public double calcArea() {
		
		return Math.PI * Math.pow(radio, 2);
	
	}

	@Override
	public double calcPerim() {
		
		return 2 * Math.PI * radio;
		
	}

	@Override
	public void dibujar() {
		
		System.out.println("\n");
        System.out.println("      88888");
        System.out.println("   88888888888");
        System.out.println("  8888888888888");
        System.out.println(" 888888888888888");
        System.out.println("88888888888888888");
        System.out.println(" 888888888888888");
        System.out.println("  8888888888888");
        System.out.println("   88888888888");
        System.out.println("      88888");
        System.out.println("\n");
		
	}

}
