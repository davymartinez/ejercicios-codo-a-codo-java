package datamusical;

import java.util.ArrayList;
import java.util.Iterator;

public class Sello {
	
	public String nombre;
	public String origen;
	public String url;
	public ArrayList<Artista> listArtistas;
	public ArrayList<Album> listAlbumes;
	
	public void agregarArtista(Artista a) {
		listArtistas.add(a);
	}
	
	public void quitarArtista(Artista a) {
		listArtistas.remove(a);
	}
	
	public void agregarAlbum(Album a) {
		listAlbumes.add(a);
	}
	
	public void mostrarArtistas() {
		Iterator<Artista> iteradorArtistas = listArtistas.iterator();
		while (iteradorArtistas.hasNext()) {
			Artista artistaSello = iteradorArtistas.next();
			System.out.println(artistaSello);
		}
	}
	
	public void mostrarAlbumes() {
		Iterator<Album> iteradorAlbumes = listAlbumes.iterator();
		while (iteradorAlbumes.hasNext()) {
			Album albumSello = iteradorAlbumes.next();
			System.out.println(albumSello);
		}
	}

	@Override
	public String toString() {
		String cadena = "Sello: " + nombre + 
				"\nOrigen: " + origen + 
				"\nSitio web: " + url + 
				"\nArtistas: " + listArtistas + 
				"\nAlbumes: " + listAlbumes;
		return cadena;
	}
	
	
	
}
