package recursividad1;

public class Divisores {
	
	public static int contarDivisores(int n) {
		int candidato = 2;
		int res = 0;
		if(n == 1) {
			res = 1;
		} else {
			res = 2 + contarDivisores(n, candidato);
		}
		return res;
	}
	
	private static int contarDivisores(int n, int div) {
		int cont;
		if(div > n/2) {
			cont = 0;
		} else {
			int aux = 0;
			if(n % div == 0) {
				aux = 1;
			} 
			cont = aux + contarDivisores(n, div + 1);
		}
		return cont;
	}
	
	public static void main(String[] args) {
		System.out.println(contarDivisores(12));
		System.out.println(contarDivisores(5));
		System.out.println(contarDivisores(27));
	}
}
