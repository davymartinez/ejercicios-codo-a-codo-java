package tpi05_inmobiliaria;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String mail;
	
	public Cliente(String n, String a, String t, String m) { // numero correcto de parametros en la funcion, pero con nombres de variables
		this.nombre = n;									 // mas cortos (p.ej.: 'n' en vez de 'nombre')
		this.apellido = a;
		this.telefono = t;
		this.mail = m;
	}

	public void avisarCambioPrecio(Inmueble x, int nuevoPrecio){
		String mensajeCambioPrecio = "\n\nSr(a): " + obtenerNombreCompleto() + "\nSe le notifica que el inmueble identificado como " + 
									 x.getDomicilio() + " ha experimentado un cambio de precio, " + "quedando en " + nuevoPrecio;
									// Este codigo estuvo basicamente bien planteado, solamente se agrego la llamada al metodo
									// obtenerNombreCompleto() y el .getDomicilio() al inmueble x, mas unos saltos de linea para mejor legibilidad
		enviarMail("El inmueble que Ud. esta siguiendo ha cambiado de precio", mensajeCambioPrecio); // OK
	}
	
	public void avisarReserva(Inmueble x){
		String mensajeAvisoReserva = "\n\nSr(a): " + obtenerNombreCompleto() + "\nSe le notifica que el inmueble identificado como " + 
									 x.getDomicilio() + " ha sido reservado."; // Mismo caso del metodo avisarCambioPrecio()
		enviarMail("El inmueble que Ud. esta siguiendo ha sido reservado", mensajeAvisoReserva); // OK
	}
	
	public void avisarVenta(Inmueble x){
		String mensajeAvisoVenta = "\n\nSr(a): " + obtenerNombreCompleto() + "\nSe le notifica que el inmueble identificado como " + 
								   x.getDomicilio() + " ha sido vendido."; // Idem dos metodos anteriores
		enviarMail("El inmueble que Ud. esta siguiendo ha sido vendido", mensajeAvisoVenta); // OK
	}
	
	private void enviarMail(String asunto, String cuerpo){ // ERROR: declarar como void, no como String
		/* return "Asunto: " + asunto + 
				"\nMensaje: " + cuerpo;*/ // no es necesario este return
		String mensaje = "Para: " + this.mail + "\n" + 
						 "Asunto: " + asunto + "\n" + 
						 "Mensaje: " + cuerpo + "\n";
		GUI.mostrarCartel(mensaje, "Enviando mail...", 1);
	}
	
	public String obtenerNombreCompleto(){
		return this.nombre + " " + this.apellido; // OK
	}
	
	@Override
	public String toString(){
		/*return obtenerNombreCompleto() +
				"\nTel: " + this.telefono + 
				"\nMail: " + this.mail;*/ // Plantear como sigue:
		// Declaramos la siguiente cadena:
		String cadena = "Nombre: " + this.nombre +
						"\nApellido: " + this.apellido +
						"\nTelefono: " + this.telefono +
						"\nMail: " + this.mail;
		return cadena;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
