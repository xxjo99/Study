package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_17103 {

	// false일경우 소수
	public static boolean[] prime(boolean[] arr, int n) {
		arr[0] = arr[1] = true;

		for (int i = 2; i * i <= n; i++) {
			if (!arr[i]) {
				for (int j = i * i; j <= n; j += i) {
					arr[j] = true;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) throws IOException {
		// 골드바흐 파티션
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			boolean[] arr = new boolean[n + 1];
			arr = prime(arr, n);
			
			for (boolean a : arr) {
				System.out.println(a);
			}
			
			int count = 0;
			for (int j = 2; j < n; j++) {
				
				if (arr[j] == false) {
					int a = n - j;
					if (arr[a] == false && a >= j) {
						count++;
					}
				}
				
			}
			
			System.out.println(count);
		}

	}

}
