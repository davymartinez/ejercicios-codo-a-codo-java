package banco;

import ejemplodeagregacion.GUI;

public class CuentaBancaria {
	
	private final String cbu;
	private String alias;
	private Cliente titular;
	private double saldo;
	private static long ultimoNumeroDeCuenta = 1234;
	
	public CuentaBancaria(String alias, Cliente titular) {
		this.cbu = this.generarCbu();
		this.alias = alias;
		this.titular = titular;
		// valor por defecto de saldo = 0, no hace falta inicializar
	}
	
	public void depositar(double monto)	{
		this.saldo += monto;
		String mensaje = "Se depositaron $" + monto + 
				"\nEl nuevo saldo es $" + this.saldo;
		GUI.mostrarCartel(mensaje, "Operacion satisfactoria", 1);
	}
	
	public boolean extraer(double monto) {
		if (monto > this.saldo) {
			GUI.mostrarCartel("Fondos insuficientes", "ERROR", 0);
			return false;
		} else {
			this.saldo -= monto;
			String mensaje = "Se extrajeron $" + monto +
					"\nEl nuevo saldo es $" + this.saldo;
			GUI.mostrarCartel(mensaje, "Operacion satisfactoria", 1);
			return true;
		}
	}
	
	private String generarCbu() {
		/* La CBU está compuesta por 22 dígitos, separados en dos bloques. El primer bloque tiene un número de entidad de 3 dígitos, un número 
		 * de sucursal de 4 dígitos y un dígito verificador. El segundo bloque tiene un número de 13 dígitos que identifica la cuenta dentro de 
		 * la entidad y la sucursal, más un dígito verificador.*/
		String numeroDeCuenta = "" + ultimoNumeroDeCuenta++;
		while (numeroDeCuenta.length() < 13) {
			numeroDeCuenta = "0" + numeroDeCuenta;
		}
		return "28505909" + numeroDeCuenta + "1"; // Nro de entidad: 285; nro de sucursal: 0590; digito verificador: 9
	}

	public String getCbu() {
		return cbu;
	}

	public String getAlias() {
		return alias;
	}

	public Cliente getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
    public String toString()
    {
        return "CBU: " + this.cbu + 
               "\nAlias: " + this.alias + 
               "\nTitular: " + this.titular.obtenerNombreCompleto() + 
               "\nSaldo actual: $" + this.saldo + ".-";
    }

}
