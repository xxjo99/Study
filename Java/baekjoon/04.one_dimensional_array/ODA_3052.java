package one_dimensional_array;

import java.util.Scanner;

public class ODA_3052 {

	public static void main(String[] args) {
		// ³ª¸ÓÁö
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for (int i=0; i<10; i++) {
			arr[i] = sc.nextInt()%42;
		}
		for (int i=0; i<10; i++) {
			int count2 = 0;
			for (int j=i+1; j<10; j++) {
				if (arr[i]==arr[j]) {
					count2++;
				} 
			}
			if (count2==0) {
				count ++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
