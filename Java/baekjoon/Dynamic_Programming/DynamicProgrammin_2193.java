package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_2193 {
	
	public static long[] check;
	
	public static long dp(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else if (check[n] != 0) {
			return check[n];
		} else {
			return check[n] = dp(n-1) + dp(n-2);
		}
	}

	public static void main(String[] args) throws IOException {
		// 이친수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());;
		check = new long[n + 1];
		
		System.out.println(dp(n));

	}
}
