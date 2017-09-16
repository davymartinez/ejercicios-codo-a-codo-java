package practicaobjetos;

public class CuentaBancaria {
	
	Persona titular;
	double saldo;
	String alias;
	String cbu;
	char moneda;
	
	public CuentaBancaria(Persona titular, String alias, char moneda) {
		this.titular = titular;
		this.alias = alias;
		this.moneda = moneda;
		this.cbu = generarCBU();
	}
	
	private String generarCBU() {
		return titular.getDni() + "555" + Math.round( Math.random() * 100000 );
	}

	public void mostrarSaldo() {
		System.out.println("" + moneda + saldo);
	}
	
	public void depositar(double monto) {
		saldo += monto;
		mostrarSaldo();
	}
	
	void extraer(double monto) {
		
		if (saldo >= monto) {
			saldo -= monto;
			mostrarSaldo();
		} else {
			System.out.println("Saldo insuficiente.");
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", alias=" + alias + ", cbu=" + cbu
				+ ", moneda=" + moneda + "]";
	}
	
	
	
}
