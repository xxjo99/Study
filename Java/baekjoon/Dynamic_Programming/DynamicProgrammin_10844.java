package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_10844 {

	static long[][] dp;
	static long mod = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		// 쉬운 계단수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new long[n + 1][10];
		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					dp[i][j] = (dp[i - 1][j + 1]) % mod;
				} else if (j == 9) {
					dp[i][j] = (dp[i - 1][j - 1]) % mod;
				} else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
				}

			}
		}

		long sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum += dp[n][i];
		}
		System.out.println(sum % mod);

	}
}
