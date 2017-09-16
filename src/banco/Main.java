package banco;

public class Main {
	
	public static void main(String[] args)
    {
        Cliente c1 = new Cliente("Selma","Bouvier","24435332","selma_bouvier@traf.com","Bulnes",1234,0,"B","CABA",1432);
        Cliente c2 = new Cliente("Frank","Grimes","48754124","fgrimes@plantanuclear.org","Av. Rivadavia",10547,4,"Ciudadela",1848);
        
        CuentaBancaria cuenta1 = new CuentaBancaria("selbou", c1);
        CuentaBancaria cuenta2 = new CuentaBancaria("fgrimes", c2);
        
        GUI.mostrarCartel(cuenta1);
        GUI.mostrarCartel(cuenta2);
        
        cuenta1.depositar(3000);
        cuenta1.extraer(800);
        cuenta1.extraer(3500);
        
        cuenta2.depositar(5000);
        cuenta2.extraer(800);
        cuenta2.extraer(3500);
    }

}
