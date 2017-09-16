
package mascotas;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, int peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }
    
    public Perro(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.raza = "Callejero";
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void comer() {

    	System.out.println("Hmmm, huesos! Mi comida favorita!");
		
	}
    
    @Override
    public String toString() {
        return super.toString() + " De raza " + this.raza;
    }
    
    @Override
    public void expresarse () {
        System.out.println(super.getNombre() + ": GUAU GUAU");
    }
    
}
