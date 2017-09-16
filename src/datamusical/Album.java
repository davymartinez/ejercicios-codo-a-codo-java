package datamusical;

import java.util.Arrays;

public class Album {
	
	public String nombre;
	public int anio;
	public String[] tracklist;
	public Sello sello;
	public String genero;
	public String tipoAlbum;
	public int idAlbum;
	
	public void mostrarCanciones() {
		for (int i = 0; i < tracklist.length; i++) {
			System.out.println((i+1) + "." + tracklist[i] + "\n");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String[] getTracklist() {
		return tracklist;
	}

	public void setTracklist(String[] tracklist) {
		this.tracklist = tracklist;
	}

	public Sello getSello() {
		return sello;
	}

	public void setSello(Sello sello) {
		this.sello = sello;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoAlbum() {
		return tipoAlbum;
	}

	public void setTipoAlbum(String tipoAlbum) {
		this.tipoAlbum = tipoAlbum;
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	@Override
	public String toString() {
		String cadena = "Nombre: " + nombre + 
				"\nAño: " + anio + 
				"\nCanciones: " + Arrays.toString(tracklist) + 
				"\nSello: "	+ sello + 
				"\nGénero: " + genero + 
				"\nTipo de Album: " + tipoAlbum + 
				"\nID de Album: " + idAlbum;
		return cadena;
	}
	
}
