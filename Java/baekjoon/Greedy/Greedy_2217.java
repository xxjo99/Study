package Greedy;

import java.util.Scanner;
import java.util.Arrays;

public class Greedy_2217 {

	public static void main(String[] args) {
		// 로프
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int max = 0;
		int a = 1;

		for (int i = n - 1; i >= 0; i--) {
			int b = arr[i] * a;
			a++;
			if (b > max) {
				max = b;
			}
		}

		System.out.println(max);

		sc.close();
	}

}
