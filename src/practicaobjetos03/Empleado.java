package practicaobjetos03;

public class Empleado extends Persona {
	
	private double sueldo;
	private String puesto;
	
	public Empleado(String nombre, String apellido, int edad, char genero, String calle, 
			int altura, String localidad, double sueldo, String puesto) {
		super(nombre, apellido, edad, genero, calle, altura, localidad);
		this.sueldo = sueldo;
		this.puesto = puesto;
	}

	public void protestar() {
		System.out.println("PÁGUENME MI AUMENTO!!!");
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
