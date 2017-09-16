package ejemplodecomposicion;

public class Main {
	
	public static void main(String[] args) {
		
		Persona c1 = new Persona("Selma","Bouvier","24435332","selma_bouvier@traf.com","Bulnes",1234,0,"B","CABA",1432);
		Persona c2 = new Persona("Frank", "Grimes", "48754124","fgrimes@plantanuclear.org","Av. Rivadavia",10547,4,"Ciudadela",1848);
        Persona c3 = new Persona("Charles Montgomery","Burns","1158641244","cmburns@plantanuclear.org","Av. Libertador",1515,"CABA",1598);
        Persona c4 = new Persona("Kirk","Van Houten","38471459","kirko.10@cookiesvh.com","Pichincha",784,"3","CABA",1432);
		
        GUI.mostrarCartel(c1);
        GUI.mostrarCartel(c2);
        GUI.mostrarCartel(c3);
        GUI.mostrarCartel(c4);
        
	}

}
