package datamusical;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo extends Artista {
	
	public ArrayList<Artista> integrantes;
	public int cantidadIntegrantes;
	public int idGrupo;
	
	public Grupo(String nombre, String genero, String idioma, String origen, String era, String tipo, int idArtista) {
		super(nombre, genero, idioma, origen, era, tipo, idArtista);
	}
	
	public void agregarIntegrante(Artista a) {
		integrantes.add(a);
	}
	
	public void quitarIntegrante(Artista a) {
		integrantes.remove(a);
	}
	
	public void getIntegrantes() {
		Iterator<Artista> iteradorIntegrantes = integrantes.iterator();
		while (iteradorIntegrantes.hasNext()) {
			Artista integrante = iteradorIntegrantes.next();
			System.out.println(integrante);
		}		
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	@Override
	public String toString() {
		String cadena = "Integrantes: " + this.integrantes + 
				"\nID de Grupo: " + idGrupo;
		return cadena;
	}
	
}
