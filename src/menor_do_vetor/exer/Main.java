package menor_do_vetor.exer;

public class Main {

	public static void main(String[] args) {
		int v [] = {1, 2, 3, 4, 5};
		int inicio = 0;
		int fim = 4;
		System.out.println("Menor valor do vetor: " + menor(v, inicio, fim));
	}
		
		public static int menor(int v[], int inicio, int fim) {

			  int meio = (inicio+fim)/2;

			  int n1, n2;

			  if(meio<inicio){

			         n1=menor(v, inicio, meio);

			         n2=menor(v, meio+1, fim);

			  } else{

			    n1=v[inicio];

			    n2=v[fim];

			  }

			  if(n1<n2) return n1; else return n2;

		}
	}
