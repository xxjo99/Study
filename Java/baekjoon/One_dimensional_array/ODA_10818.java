package one_dimensional_array;
import java.util.Scanner;

public class ODA_10818 {
	public static void main(String[] args) {
		/* 최대, 최소 */
		Scanner sc = new Scanner(System.in);
		int min = 1000000;
		int max = -1000000;
		int n = sc.nextInt(); 
		int[] numbers = new int[n]; 
		for(int i = 0; i < n; i++){ 
		      numbers[i] = sc.nextInt();
		      if (max < numbers[i]) { 
		      max = numbers[i];
		      }    
		      if (min > numbers[i]) {
		      min = numbers[i];
		      }        
		   }
		sc.close();
		System.out.println(min + " " + max);
	}
		    
}
		 
