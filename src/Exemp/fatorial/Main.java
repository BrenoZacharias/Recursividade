package Exemp.fatorial;

public class Main {
	
	private static int X(int n){
		   if ((n==1)  || (n==2)) return n;
		   else return X(n-1)+ n * X(n-2);
		}
	
	public static void main(String[] args) {
			System.out.println("" + X(4));
		}
}
