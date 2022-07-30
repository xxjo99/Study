package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Recursion_19947 {

	public static void main(String[] args) throws IOException {
		// 투자의 귀재 배주형
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		long[] dp = new long[y + 1];
		dp[0] = h;
		
		for (int i = 1; i <= y; i++) {
			dp[i] = (long) (dp[i - 1] * 1.05);
			
			if (i >= 3) {
				dp[i] = (long) Math.max(dp[i], dp[i-3] * 1.2);
			}
			
			if (i >= 5) {
				dp[i] = (long) Math.max(dp[i], dp[i-5] * 1.35);
			}
		}
		
		System.out.println(dp[y]);
				
	}

}
