
package mascotas;

public class Gato extends Mascota {
    
    private String color;

    public Gato(String nombre, int edad, int peso, String color) {
        super(nombre, edad, peso);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return super.toString() + " De color " + this.color;
    }
    
    @Override
    public void expresarse () {
        System.out.println(super.getNombre() + ": MIAU MIAU");
    }
    
    @Override
    public void comer() {

    	System.out.println("Hmmm, pescado! Mi comida favorita!");
		
	}
    
}
