package practicaobjetos03;

public class Domicilio {
	
	private String calle;
	private int altura;
	private String localidad;
	
	public Domicilio(String calle, int altura, String localidad) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.localidad = localidad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return this.calle + " " + this.altura + ", " + this.localidad;
	}

}
