package somavetor.exerc;

public class Main {

	public static void main(String[] args) {
		int [] v = {10, 20, 30, 40, 50}; int n = v.length;
		System.out.println("Soma vetor = " + somaVetor(v, n));
	}
	
	private static int somaVetor(int [] v, int n){
		if (n==1) return v[0];
		return v[n - 1]+somaVetor(v, n - 1);
	}
}
