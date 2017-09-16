package practicaobjetos02;

import practicaobjetos.Persona;

public class Prueba {

	public Prueba() {
		
		Persona p = new Persona("Homero", "Simpson", 46);
		System.out.println( p.getNombre() );
		System.out.println( p.getApellido() );
		System.out.println( p.getEdad() );
		
	}
	
}