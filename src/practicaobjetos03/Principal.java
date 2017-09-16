package practicaobjetos03;

public class Principal {

	public static void main(String[] args) {
		
		Persona fulano = new Persona("Lemmy", "Kilmister", 64, 'M', "Monroe", 2345, "CABA");
		Persona mengano = new Persona("Patti", "Smith", 51, 'f', "Acacia", 567, "Detroit");
		Empleado homero = new Empleado("Homero", "Simpson", 49, 'M', "Elm", 3456, "Springfield", 25000, "Supervisor Técnico");
		
		System.out.println( fulano.getNombre() + " tiene " + fulano.getEdad() + " años y vive en " + fulano.getDomicilio() );
		System.out.println( mengano.getNombre() + " vive en: " + mengano.getDomicilio() );
		System.out.println( "El sueldo de " + homero.getNombre() + " " + homero.getApellido() + " es: "+ homero.getSueldo() );

	}

}
