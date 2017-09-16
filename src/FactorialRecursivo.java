public class FactorialRecursivo {

	public static void main(String[] args) {
		
		int x = 5;
		System.out.println("El factorial de " + x + " es: " + factorial(x));
		
	}
	
	static long factorial(int n) {
		if (n == 0)
		{
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
