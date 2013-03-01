import java.util.ArrayList;
import java.util.Scanner;


public class SelectionSort {

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
		
		for (int i = 0; i < n ; i++) {
			int min = i;
			for (int j = i+1; j < n; j++) {
				if (vetor.get(j) < vetor.get(min)) {
					min=j;
				}
				
					int aux = vetor.get(min);
					vetor.set(min,vetor.get(i));
					vetor.set(i,aux);
					
					

				
			}
		}
		System.out.println("Vetor Ordenado");
		System.out.println(vetor.toString());
	

	}

}

