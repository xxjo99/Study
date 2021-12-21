package one_dimensional_array;

import java.util.Scanner;

public class ODA_2562 {

	public static void main(String[] args) {
		/* √÷¥Î */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = -1000;
		int a = 0;
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				a = i+1;
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(a);
	}
	
}
