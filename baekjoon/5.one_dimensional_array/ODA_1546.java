package one_dimensional_array;

import java.util.Scanner;

public class ODA_1546 {

	public static void main(String[] args) {
		// ЦђБе
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int max = -1;
		int sum = 0;
		double avg = 0.0;
		for (int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		avg = 100*sum/max/a;
		System.out.println(avg);
		sc.close();
	}

}
