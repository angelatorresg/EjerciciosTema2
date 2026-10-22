package recursividad1;

public class Divisores {
	
	public static int contarDivisores(int n) {
		int candidato = 2;
		if(n == 1) {
			return 1;
		} 
		return (2 + contarDivisores(n, candidato));
	}
	
	private static int contarDivisores(int n, int div) {
		if(div > n/2) {
			return 0;
		} 
		int aux = 0;
		if(n % div == 0) {
			aux = 1;
		} 
		return (aux + contarDivisores(n, div + 1));
	}
	
	public static void main(String[] args) {
		System.out.println(contarDivisores(12));
		System.out.println(contarDivisores(5));
		System.out.println(contarDivisores(27));
	}
}
