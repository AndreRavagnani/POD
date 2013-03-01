import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort{
  public static void main(String a[]){
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
		mergeSort_srt(vetor,0, vetor.size());
		  System.out.print("Values after the sort:\n");
  }

  public static void mergeSort_srt(ArrayList<Integer> vetor,int lo, int n){
  int low = lo;
  int high = n;
  if (low >= high) {
  return;
  }

  int middle = (low + high) / 2;
  mergeSort_srt(vetor, low, middle);
  mergeSort_srt(vetor, middle + 1, high);
  int end_low = middle;
  int start_high = middle + 1;
  while ((lo <= end_low) && (start_high <= high)) {
  if (vetor.get(low) < vetor.get(start_high)) {
  low++;
  } else {
  int Temp = vetor.get(high);
  for (int k = start_high- 1; k >= low; k--) {
  vetor.set(k+1,vetor.get(k));
  }
  vetor.set(low,Temp);
  low++;
  end_low++;
  start_high++;
  }
  }
  }  
}