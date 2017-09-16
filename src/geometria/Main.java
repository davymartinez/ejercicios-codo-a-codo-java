package geometria;

public class Main {
	
	public static void main(String args[]) {
		
		Rectangulo r = new Rectangulo("Bandera", 2, 3);
		TrianguloEquilatero te = new TrianguloEquilatero("Triangulin", 4);
		Circunferencia c = new Circunferencia(5);
		
		r.dibujarEnConsola();
		te.dibujarEnConsola();
		c.dibujarEnConsola();
		
	}

}
