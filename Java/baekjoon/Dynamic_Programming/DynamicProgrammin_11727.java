package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_11727 {

	public static void main(String[] args) throws IOException {
		// 2×n 타일링 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2]  = 3;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i] = (dp[i - 1] + 2* dp[i - 2]) % 10007;
		}
		System.out.println(dp[n]);

	}
}
