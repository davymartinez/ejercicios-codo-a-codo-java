package practicaobjetos03;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private char genero;
	private Domicilio domicilio;
	
	public Persona(String nombre, String apellido, int edad, char genero, String calle, int altura, String localidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.domicilio = new Domicilio(calle, altura, localidad);
	}

	public void Hablar(String mensaje) {
		System.out.println("Soy " + nombre + " y te digo " + mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
}
