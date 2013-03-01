import java.util.ArrayList;
import java.util.Scanner;


public class BubbleSort {

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
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if (vetor.get(j) > vetor.get(j+1) ) {
					int aux = vetor.get(j);
					vetor.set(j,vetor.get(j+1));
					vetor.set(j+1,aux);
				}
				
			}
		}
		System.out.println("Vetor Ordenado");
		System.out.println(vetor.toString());
	}

}
