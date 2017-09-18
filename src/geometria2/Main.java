package geometria2;

public class Main {

	public static void main(String[] args) {
		
		Cuadrilatero cuad = new Cuadrilatero(4, 4);
		TriangEquilatero triang = new TriangEquilatero(4);
		Circulo circ = new Circulo(4);
		Auto teslaS = new Auto("Tesla", "Model S", 2017, 4, "Manual");
		
		System.out.println("El area de nuestro cuadrado es: " + cuad.calcArea() + " y su forma es:");
		cuad.dibujar();
		
		System.out.println("El area de nuestro triangulo es: " + triang.calcArea() + " y su forma es:");
		triang.dibujar();
		
		System.out.println("El area de nuestro circulo es: " + circ.calcArea() + " y su forma es:");
		circ.dibujar();
		
		System.out.println(teslaS.toString());
		teslaS.dibujar();

	}

}
