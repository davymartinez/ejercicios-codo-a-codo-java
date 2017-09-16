
package mascotas;


public class Loro extends Mascota 
{
    private int volumen;
    
    public Loro (String n, int e, int p, int v) {
        super(n,e,p);
        volumen = v;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Con volumen " + this.volumen;
    }

    @Override
    public void expresarse() {
        System.out.println(super.getNombre() + ": PRRRR PRRRR");
    }
    
    @Override
    public void comer() {

    	System.out.println("Hmmm, semillas de girasol! Mi comida favorita!");
		
	}
    
}
