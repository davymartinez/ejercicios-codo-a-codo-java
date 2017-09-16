package tpi05_inmobiliaria;

public class Inmobiliaria {
	
	private String nombre;
	private int cantInmuebles;
	private final int CANT_MAX_INMUEBLES; // ALTERNA ---> = 20; el valor se puede declarar dentro del constructor
	private Inmueble[] inmuebles; // tenemos que guardar los inmuebles dentro de un array
	// ERROR: private Inmueble inmueble; --> no se declaro como array
	
	// ERROR: public Inmobiliaria(String nombre, int cantInmuebles) --> exceso de par�metros
	public Inmobiliaria(String n) {
		// ERROR: this.nombre = nombre;
		this.nombre = n;
		this.CANT_MAX_INMUEBLES = 20;
		this.inmuebles = new Inmueble[this.CANT_MAX_INMUEBLES]; // <-- no se había declarado esto, estamos creando un arreglo de
															   // inmuebles que tenga maximo 20 elementos
		// ERROR: this.cantInmuebles = cantInmuebles; --> innecesario, ya que cantInmuebles es por defecto 0 
	}

	public void agregarInmueble(Inmueble x){
		if (this.cantInmuebles == this.CANT_MAX_INMUEBLES) { // si ya tenemos 20 inmuebles
			GUI.mostrarCartel("Esta inmobiliaria ya tiene el m�ximo de inmuebles permitidos (20)", "Error", 0);
		} else {
			this.inmuebles[this.cantInmuebles] = x; // se carga el inmueble 'x' en la posicion disponible del array de inmuebles
			this.cantInmuebles++; // incrementamos la cantidad de inmuebles
		}
	}
	
	public void quitarInmueble(Inmueble x){
		int pos = posicionInmueble(x); // variable interna que recibe el resultado del metodo posicionInmueble
		if (pos != -1) { // si la posicion esta dentro del array
			for (int i = pos; i < this.cantInmuebles-1; i++) { // recorremos el array
				this.inmuebles[i] = inmuebles[i+1]; // guardamos el inmueble (i+1)-esimo en el indice i (el inmueble #1 queda en el indice #0)
			}
			this.inmuebles[this.cantInmuebles-1] = null; // asignamos el valor null para "sacar" el inmueble del array
			this.cantInmuebles--; // decrementamos el valor de cantInmuebles
		}
	}
	
	private int posicionInmueble(Inmueble x){
		/* int posicionInmueble = 0;
		if (posicionInmueble < CANT_MAX_INMUEBLES) {
			posicionInmueble++;
		}
		return posicionInmueble; <-- ERROR: esto no hace lo que necesitamos */
		for (int i = 0; i < this.cantInmuebles; i++) { // recorremos el arreglo de inmuebles
			if (inmuebles[i] == x) { // comparamos la posicion dentro del array con el inmueble 'x'
				return i; // regresamos la posicion del inmueble dentro del array
			}
		}
		return -1; // POR QUE?
	}
	
	public void mostrarDatos(){
		/*System.out.println("Nombre de Inmobiliaria: " + getNombre());
		System.out.println("Cantidad de inmuebles en oferta: " + getCantInmuebles()); <-- ERROR: no vamos a trabajar con consola */
		GUI.mostrarCartel(this, "Datos de la Inmobiliaria", 0); // ANALIZAR FUNCIONAMIENTO DE GUI.java
	}
	
	@Override
	public String toString(){
		// return this.nombre + " " + this.cantInmuebles + " " + this.inmuebles;<--ERROR: necesitamos definir un dato de tipo cadena
		String cadena = "Inmobiliaria \"" + this.nombre + "\"\n\n";
		cadena += "Inmuebles:\n\n";
		for (int i = 0; i < this.cantInmuebles; i++) {
			cadena += this.inmuebles[i] + "\n\n";
		}
		return cadena;
	}

	public String getNombre() {
		return nombre;
	}

	/*public void setNombre(String nombre) { // setter innecesario
		this.nombre = nombre;
	}*/

	public int getCantInmuebles() {
		return cantInmuebles;
	}

	/*public void setCantInmuebles(int cantInmuebles) { // setter innecesario
		this.cantInmuebles = cantInmuebles;
	}*/
	
}
