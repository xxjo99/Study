package Greedy;

import java.util.Scanner;

public class Greedy_11407 {

	public static void main(String[] args) {
		// 동전0
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n];

		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (coin[i] <= k) {
				count += (k / coin[i]);
				k = k % coin[i];
			}
		}
		System.out.println(count);

		sc.close();
	}

}
