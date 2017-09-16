package datamusical;

import java.util.ArrayList;
import java.util.Iterator;

public class Artista {
	
	protected String nombre;
	protected String genero;
	protected String idioma;
	protected String origen;
	protected String era;
	protected String tipo;
	protected ArrayList<Album> albumes;
	public int idArtista;

	public Artista(String nombre, String genero, String idioma, String origen, String era, String tipo, int idArtista) {
		//super();
		this.nombre = nombre;
		this.genero = genero;
		this.idioma = idioma;
		this.origen = origen;
		this.era = era;
		this.tipo = tipo;
		this.idArtista = idArtista;
	}

	public Artista(String nombre, int idArtista) {
		//super();
		this.nombre = nombre;
		this.idArtista = idArtista;
	}

	public void agregarAlbum(Album a) {
		albumes.add(a);
	}
	
	public void mostrarAlbumes() {
		Iterator<Album> iteradorAlbumes = albumes.iterator();
		while (iteradorAlbumes.hasNext()) {
			Album album = iteradorAlbumes.next();
			System.out.println(album);
		}
	}
	
	/*public void mostrarDatos() {
		//codigo
	}*/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdArtista() {
		return idArtista;
	}

	@Override
	public String toString() {
		String cadena = "Artista: " + this.nombre +
				"\nGenero: " + this.genero + 
				"\nIdioma: " + this.idioma + 
				"\norigen: " + this.origen + 
				"\nEra: " + this.era + 
				"\nTipo: " + this.tipo + 
				"\nId: " + this.idArtista;
		return cadena;
	}

}
