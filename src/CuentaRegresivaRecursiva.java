public class CuentaRegresivaRecursiva {

	public static void main(String[] args) {
		
		cuentaRegresiva(5000);
		
	}
	
	static void cuentaRegresiva(int x) {
		
		if (x == 0)
		{
			System.out.println(x);
		} else {
			System.out.println(x);
			cuentaRegresiva(x-1);
		}
	
	}

}
