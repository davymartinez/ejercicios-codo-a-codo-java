package animales2;

public class Perro extends Mascota {
	
	private String raza;

	public Perro(String nombre, int edad, int peso, String raza) {
		super(nombre, edad, peso);
		this.raza = raza;
	}

	public Perro(String nombre, int edad, int peso) {
		super(nombre, edad, peso);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public void hablar() {
		System.out.println(super.getNombre() + " " + "dice guau-guau!");
	}
	
	@Override
	public void jugar() {
		System.out.println(super.getNombre() + " " + "va a buscar la pelota y la trae!");
	}

	@Override
	public String toString() {
		return "Perro raza: " + raza + ", nombre: " + this.getNombre() + ", peso: " + this.getPeso();
	}
	
}
