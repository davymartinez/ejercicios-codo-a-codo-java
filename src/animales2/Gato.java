package animales2;

public class Gato extends Mascota {
	
	private String color;

	public Gato(String nombre, int edad, int peso, String color) {
		super(nombre, edad, peso);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void hablar() {
		System.out.println(super.getNombre() + " " + "dice miiiaaauuu!");
	}
	
	public void ronronear() {
		System.out.println(super.getNombre() + " " + "dice mrrrrrrrr");
	}
	
	@Override
	public void jugar() {
		System.out.println(super.getNombre() + " " + "araña el ovillo!");
	}

	@Override
	public String toString() {
		return "Gato color: " + color + ", nombre: " + this.getNombre() + ", edad: " + this.getEdad() 
		+ ", peso: " + this.getPeso();
	}
	
}
