package tpi05_inmobiliaria;

public class Inmueble {
	
	private String domicilio;
	private double superficie;
	private int cantAmbientes;
	private int precioDolares;
	private Cliente[] interesados; // ERROR: esta variable no se habia declarado
	private int cantInteresados;
	private final int CANT_MAX_INTERESADOS /*= 5*/; // no deberiamos declarar el valor de esta constante aqui
	private boolean reservado;
	private boolean vendido;
	
	/* public Inmueble(String domicilio, double superficie, int cantAmbientes, int precioDolares, int cantInteresados,
			boolean reservado, boolean vendido) { */ // Solo necesitabamos los siguientes cuatro parametros:
	public Inmueble(String d, double s, int ca, int p) {
		this.domicilio = d;
		this.superficie = s;
		this.cantAmbientes = ca;
		this.precioDolares = p;
		/*this.cantInteresados = cantInteresados; // valor por defecto: 0
		this.reservado = reservado; // valor por defecto: False
		this.vendido = vendido;*/ // valor por defecto: False
		this.CANT_MAX_INTERESADOS = 5;
		this.interesados = new Cliente[this.CANT_MAX_INTERESADOS]; // creamos un array de tipo Cliente[] que contendra un maximo de cinco clientes
	}

	public void agregarInteresado(Cliente c){
		if (this.cantInteresados == this.CANT_MAX_INTERESADOS) {
			GUI.mostrarCartel("Este inmueble ya tiene demasiados interesados", "Error", 0);
		} else {
			this.interesados[this.cantInteresados] = c; // agregamos el cliente al array en la posicion correspondiente
			this.cantInteresados++;
		}
	}
	
	public void quitarInteresado(Cliente c){ // codigo analogo al de quitarInmueble()
		int pos = posicionInteresado(c);
		if (pos != -1) {
			for (int i = pos; i < this.cantInteresados-1; i++) {
				this.interesados[i] = interesados[i+1];
			}
			this.interesados[this.cantInteresados-1] = null;
			this.cantInteresados--;
		}
	}
	
	private int posicionInteresado(Cliente c) { // codigo analogo al de posicionInmueble()
		/*int posicion = 0;
		return posicion;*/
		for (int i = 0; i < this.cantInteresados; i++) {
			if (interesados[i] == c) {
				return i;
			}
		}
		return -1;
	}
	
	public void reservar() {
		this.reservado = true;
		for (int i = 0; i < this.cantInteresados; i++) { // recorremos el array de interesados
			this.interesados[i].avisarReserva(this);	 // y ejecutamos el metodo avisarReserva para el interesado en cuestion
		}												 // con este inmueble (this) como argumento
	}
	
	public void vender(){ // codigo analogo al de reservar()
		this.vendido = true;
		for (int i = 0; i < this.cantInteresados; i++) {
			this.interesados[i].avisarVenta(this);
		}
	}
	
	public void mostrarDatos(){
		GUI.mostrarCartel(this, "Datos de la Inmobiliaria", 1);
	}
	
	@Override
	public String toString(){
		/* return "Domicilio: " + this.domicilio +
				"\nCantidad de Ambientes: " + this.cantAmbientes +
				"\nSuperficie: " + this.superficie +
				"\nPrecio (USD): " + this.precioDolares +
				"\nCantidad de Interesados: " + this.cantInteresados + 
				"\nReservado?: " + this.reservado + 
				"\nVendido?: " + this.vendido; */ //---> ERROR: declaracion incompleta
		String cadena = "Domicilio: " + this.domicilio + "\n" + 
						"Superficie: " + this.superficie + "\n" + 
						"Cantidad de ambientes: " + this.cantAmbientes + "\n" +
						"Precio (US$): " + this.precioDolares + "\n" + 
						"Reservado?: " + this.reservado + "\n" +
						"Vendido?: " + this.vendido + "\n" + 
						"Este inmueble tiene " + this.cantInteresados + " interesados: ";
		if (this.cantInteresados > 0) {
			/*cadena += this.interesados[0].obtenerNombreCompleto();*/ // PROBAR SI ESTO OCASIONA LA DOBLE IMPRESION
			for (int i = 0; i < this.cantInteresados; i++) {
				cadena += this.interesados[i].obtenerNombreCompleto(); // esto esta causando que el nombre del interesado
			}																  	  // se imprima dos veces // PENDIENTE CON EL ", "
		}
		return cadena + "\n";
	}

	public String getDomicilio() {
		return domicilio;
	}

	public double getSuperficie() {
		return superficie;
	}

	public int getCantAmbientes() {
		return cantAmbientes;
	}

	public int getPrecioDolares() {
		return precioDolares;
	}
	
	// ATENCI�N: SETTER IMPORTANTE CON CODIGO NO DEFAULT
	public void setPrecioDolares(int nuevoPrecio) {
		this.precioDolares = nuevoPrecio;
		if (this.interesados != null) {
			for (int i = 0; i < cantInteresados; i++) {
				this.interesados[i].avisarCambioPrecio(this, nuevoPrecio);
			}
		}
	}

	public int getCantInteresados() {
		return cantInteresados;
	}
	
	public int getCANT_MAX_INTERESADOS() {
		return CANT_MAX_INTERESADOS;
	}
	
	public boolean isReservado() {
		return reservado;
	}
	
	public boolean isVendido() {
		return vendido;
	}
	
	// SETTERS INNECESARIOS
	
	/*public void setSuperficie(double superficie) {
	this.superficie = superficie;
	}*/
	
	/*public void setCantAmbientes(int cantAmbientes) {
	this.cantAmbientes = cantAmbientes;
	}*/
	
	/*public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
	}*/

	/*public void setCantInteresados(int cantInteresados) {
		this.cantInteresados = cantInteresados;
	}*/

	/*public void setCANT_MAX_INTERESADOS(int cANT_MAX_INTERESADOS) {
		CANT_MAX_INTERESADOS = cANT_MAX_INTERESADOS;
	}*/

	/*public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}*/

	/*public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}*/
	
}
