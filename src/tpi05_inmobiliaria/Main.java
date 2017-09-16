package tpi05_inmobiliaria;

public class Main {

	public static void main(String[] args) {
		
		// clientes de ejemplo
		Cliente lemmy = new Cliente("Ian Fraser", "Kilmister", "1124121945", "lemmyk@motorhead.com");
		Cliente jimmy = new Cliente("James Marshall", "Hendrix", "11271942", "hendrix@guitargod.com");
		Cliente cliff = new Cliente("Clifford Lee", "Burton", "1102101962", "cliffemall@metallica.com");
		
		// inmuebles de ejemplo
		Inmueble pringles1455 = new Inmueble("Pringles 1455", 98.76, 2, 68000);
		Inmueble billinghurst1747 = new Inmueble("Billinghurst 1747", 87.65, 3, 79000);
		Inmueble warnes1902 = new Inmueble("Av. Warnes 1902", 76.54, 3, 80000);
		Inmueble vidt2061 = new Inmueble("Vidt 2061", 89.01, 4, 91000);
		Inmueble bullrich302 = new Inmueble("Av. Int. Bullrich 302", 78.56, 2, 82000);
		
		// inmobiliarias de ejemplo
		Inmobiliaria inmobilia2000 = new Inmobiliaria("Inmobilia 2000");
		Inmobiliaria airesestate = new Inmobiliaria("Aires Estate");
		
		// agregando inmuebles a inmobiliaria
		inmobilia2000.agregarInmueble(bullrich302);
		inmobilia2000.agregarInmueble(vidt2061);
		airesestate.agregarInmueble(pringles1455);
		airesestate.agregarInmueble(warnes1902);
		airesestate.agregarInmueble(billinghurst1747);
		
		// agregando interesados
		bullrich302.agregarInteresado(cliff);
		vidt2061.agregarInteresado(jimmy);
		pringles1455.agregarInteresado(lemmy);
		warnes1902.agregarInteresado(cliff);
		billinghurst1747.agregarInteresado(jimmy);
		
		// imprimiendo datos
		airesestate.mostrarDatos();
		bullrich302.mostrarDatos();
		
		// operaciones de ejemplo
		vidt2061.setPrecioDolares(99000);
		pringles1455.reservar();
		warnes1902.vender();
		billinghurst1747.quitarInteresado(jimmy);
		
		// imprimir datos luego de cambios
		airesestate.mostrarDatos();
		billinghurst1747.mostrarDatos();
		inmobilia2000.mostrarDatos();

	}

}
