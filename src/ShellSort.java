import java.util.ArrayList;
import java.util.Scanner;


public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> vetor = new ArrayList<>();
		System.out.println("Digite a Quantidade de Itens do Vetor");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o "+ (i+1) + " Elemento");
			vetor.add(scanner.nextInt());
		}
		System.out.println("Vetor Em Possivel Desordem");		
		System.out.println(vetor.toString());
		
		double h= 1;
		while(h<=n){
			h=3*h+1;
		}
		do {
		h=(Math.floor(h));
		for (double i = h; i < n; i++) {
			int pivo = vetor.get((int) i);
			int j=(int) (i-h);
			while(j >=0 && vetor.get(j) >pivo){
				vetor.set((int) (j+h), vetor.get(j));
				j=(int) (j-h);
			}
			vetor.set((int) (j+h), pivo);
	}
		h=h/2;
		
	} while (h>1); 
		System.out.println("Vetor Ordenado");
		System.out.println(vetor.toString());
	}
}
