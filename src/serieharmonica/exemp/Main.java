package serieharmonica.exemp;

public class Main {

	private static double serie(double n) {
		if(n==1) return 1;
		return serie (n - 1) + 1 / n;
	}
	
	public static void main(String[] args) {
		for(int i = 5;i != 0;i--){
			System.out.println("Serie harmonica = " + serie(i));
		}
	}
}
