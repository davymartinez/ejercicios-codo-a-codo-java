package ejemplodeagregacion;

public class Main {
	
	public static void main(String[] args) {
		
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(3,4);
		Punto p3 = new Punto(8,6);
		Segmento s1 = new Segmento(p1,p2);
		Segmento s2 = new Segmento(p2,p3);
		
		GUI.mostrarCartel(s1.obtenerLongitud());
		GUI.mostrarCartel(s2.obtenerLongitud());
		
	}

}
