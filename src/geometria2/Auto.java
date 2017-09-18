package geometria2;

public class Auto implements Dibujable {
	
	private String marca;
	private String modelo;
	private int anio;
	private int puestos;
	private String transmision;

	public Auto(String marca, String modelo, int anio, int puestos, String transmision) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.puestos = puestos;
		this.transmision = transmision;

	}

	@Override
	public void dibujar() {
		
		System.out.println("  ______");
		System.out.println(" /|_||_\\`.__");
		System.out.println("(   _    _ _\\");
		System.out.println("=`-(_)--(_)-'");		

	}

	@Override
	public String toString() {

		return "Marca: " + this.marca + "\n"
				+ "Modelo: " + this.modelo + "\n"
				+ "Año: " + this.anio + "\n"
				+ "Puestos: " + this.puestos + "\n"
				+ "Transmision: " + this.transmision + "\n";
		
	}

}

