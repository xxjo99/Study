package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_24416 {
	
    static long[] memo;
	static int count;
	
	private static long fibo(int n) {
		
		if (n == 1 || n == 2) {
			return 1;
		} else if (memo[n] != 0) {
			return memo[n];
		} else {
			count++;
			return memo[n] = fibo(n-1) + fibo(n-2);
		}
	
		
	}

	public static void main(String[] args) throws IOException {
		// 알고리즘 수업 - 피보나치 수 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		memo = new long[n+1];
		System.out.println(fibo(n) + " " + count);
		


	}
}
