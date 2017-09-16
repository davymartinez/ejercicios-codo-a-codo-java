package practicaobjetos;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	public static int dniActual;
	private EstadoCivil estadoCivil;
	char genero;
	boolean esExtranjero;
	boolean tieneHijos;
	
	public Persona(String nombre, String apellido, int edad, String dni, EstadoCivil estadoCivil, 
			char genero, boolean esExtranjero, boolean tieneHijos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.esExtranjero = esExtranjero;
		this.tieneHijos = tieneHijos;
	}
	
	public Persona(String nombre, String apellido, int edad, String dni, EstadoCivil eCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		dniActual++;
		this.dni = "" + dniActual;
		this.estadoCivil = eCivil;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Persona() {
		nombre = "No tengo nombre";
		apellido = "No tengo apellido";
		edad = 0;
	}
	
	public static void reiniciarCuentaDNI() {
		dniActual = 0;
	}

	void devolverNombreCompleto() {
		System.out.println(nombre + " " + apellido);
	}
	
	void hablar(String frase) {
		System.out.println("hola, " + frase);
	}
	
	boolean estaEnEdadDeJubilarse() {
		return (edad >= 65 || (genero == 'f' && edad >= 60));
	}
	
	void comer(int cantidad, String comida) {
		System.out.println("Me estoy morfando " + cantidad + " de " + comida + "s");
	}
	
	void dormir() {
		System.out.println("Zzzzzz...");
	}
	
	void programar(String lenguaje) {
		System.out.println("Estoy programando en " + lenguaje);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", genero=" + genero 
				+ ", esExtranjero=" + esExtranjero + "]";
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public boolean isEsExtranjero() {
		return esExtranjero;
	}

	public void setEsExtranjero(boolean esExtranjero) {
		this.esExtranjero = esExtranjero;
	}

	public boolean isTieneHijos() {
		return tieneHijos;
	}

	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
	
	
}
