import java.util.ArrayList;
import java.util.Scanner;


public class InsertionSort {

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
		
		int pivo;
		for (int i = 0; i < n; i++) {
			pivo=vetor.get(i);
			int j =i-1;
			while (j>=0 &&  vetor.get(j) >pivo){
				vetor.set(j+1,vetor.get(j));
				j=j-1;
				vetor.set(j+1,pivo);
			}
			
		}

		System.out.println("Vetor Ordenado");
		System.out.println(vetor.toString());

	}

}
