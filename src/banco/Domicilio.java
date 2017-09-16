package banco;

public class Domicilio {
	
	private String calle;
	private int numero;
	private int piso;
	private String departamento;
	private String localidad;
	private int codPostal;
	
	public Domicilio(String calle, int numero, int piso, String departamento, String localidad, int codPostal) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.localidad = localidad;
		this.codPostal = codPostal;
	}

	public Domicilio(String calle, int numero, String localidad, int codPostal) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.codPostal = codPostal;
	}

	public Domicilio(String calle, int numero, int piso, String localidad, int codPostal) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.localidad = localidad;
		this.codPostal = codPostal;
	}

	public Domicilio(String calle, int numero, String departamento, String localidad, int codPostal) {
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
		this.localidad = localidad;
		this.codPostal = codPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	
	@Override
	public String toString() {
		return this.calle + " " + this.numero + " " + (this.piso == 0 ? "PB" : this.piso + "°") 
				+ (this.departamento == null ? "" : this.departamento + " ") + ", " + this.localidad + ". CP: " 
				+ this.codPostal;
	}

}
