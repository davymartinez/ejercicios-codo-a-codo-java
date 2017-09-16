package animales2;

public abstract class Mascota {
	
	private String nombre;
	private int edad;
	private int peso;
	
	public Mascota(String nombre, int edad, int peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public void jugar() {
		System.out.println(this.nombre + " está jugando!");
	}
	
	public void comer(String alimento) {
		System.out.println(this.nombre + " está comiendo " + alimento);
	}
	
	public abstract void hablar(); /*{
		System.out.println(getNombre() + " está hablando");
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Mascota: " + nombre + ", edad: " + edad + ", peso: " + peso;
	}
	
}


