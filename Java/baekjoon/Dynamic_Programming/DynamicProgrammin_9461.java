package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_9461 {
	
	private static long[] arr = new long[101];
	
	private static long dp(int n) {
		
		if (arr[n] == 0) {
			arr[n] = dp(n-2) + dp(n-3);
		}
		
		return arr[n];
		
	}


	public static void main(String[] args) throws IOException {
		// 파도반 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		arr[0] = -1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(dp(n));			
		}
	}

}
