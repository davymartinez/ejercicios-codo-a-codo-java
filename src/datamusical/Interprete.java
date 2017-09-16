package datamusical;

public class Interprete extends Artista {
	
	public String instrumento;
	public int idInterprete;
	
	public Interprete(String nombre, String genero, String idioma, String origen, String era, String tipo,
			int idArtista) {
		super(nombre, genero, idioma, origen, era, tipo, idArtista);
	}
	
	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public int getIdInterprete() {
		return idInterprete;
	}

	@Override
	public String toString() {
		String cadena = "Interprete: " + this.nombre +
				"\nInstrumento: " + this.instrumento +
				"\nGenero: " + this.genero + 
				"\nIdioma: " + this.idioma + 
				"\norigen: " + this.origen + 
				"\nEra: " + this.era + 
				"\nTipo: " + this.tipo + 
				"\nId: " + this.idArtista;
		return cadena;
	}
	
}
