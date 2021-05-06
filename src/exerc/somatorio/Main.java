package exerc.somatorio;

public class Main {

		private static int somatorio(int n) {
			if(n==1) return 1;
			return somatorio(n - 1) + n;
		}
		
		public static void main(String[] args) {
			for(int i = 5;i != 0;i--){
				System.out.println("Somatorio é " + somatorio(i));
			}
		}
	}
