package practicaobjetos;

public class Principal {

	public static void main(String[] args) {
		
		Persona david = new Persona();
		Persona fulano = new Persona("Pedro", "Pérez", 35, "11742790", EstadoCivil.CASADX, 'M', false, true);
		Persona mengano = new Persona("Lemmy", "Kilminster", 68, "95678908", EstadoCivil.COMPLICADX);
		
		System.out.println(david.toString());
		System.out.println(fulano.toString());
		System.out.println(mengano.toString());
		
		/*david.setNombre("David");
		david.setApellido("Martínez");
		david.setEdad(40);
		david.setDni("95690045");
		david.genero = 'm';
		david.setEstadoCivil(EstadoCivil.CASADX);
		david.genero = 'M';
		david.esExtranjero = true;
		david.tieneHijos = true;*/
		
		/*CuentaBancaria miCuenta = new CuentaBancaria(fulano, "fueraMad", '$');
		CuentaBancaria miCuentaDavid = new CuentaBancaria(david, "maldMad", '$');*/
		
		/*System.out.println(david.toString());
		System.out.println(fulano.toString());
		System.out.println(miCuenta.toString());
		System.out.println(miCuentaDavid.toString());*/
		
	}

}
