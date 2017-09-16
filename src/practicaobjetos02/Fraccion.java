package practicaobjetos02;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public String toString() {
		return numerador + "/" + denominador;
	}
	
	public Fraccion sumar(Fraccion x) {
		
		int num = (this.numerador * x.denominador) + (this.denominador * x.numerador);
		int den = this.denominador * x.numerador;
		Fraccion aux = new Fraccion(num, den);
		return aux;
		
	}
	
	public Fraccion restar(Fraccion x) {
		
		int num = (this.numerador * x.denominador) - (this.denominador * x.numerador);
		int den = this.denominador * x.numerador;
		Fraccion aux = new Fraccion(num, den);
		return aux;
		
	}
	
	public double valorReal() {
		
		double valReal = this.numerador / this.denominador;
		return valReal;
		
	}
	
	public boolean esEntera() {
		
		boolean esEntera = false;
		if (this.numerador % this.denominador == 0) {
			esEntera = true;
		};
		return esEntera;
		
	}
	
	//private simplificar(): void
	
}
