package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgrammin_1912 {

	static int[] arr;
	static Integer[] check;
	static int max;	

	private static int dp(int n) {
		
		if (check[n] == null) {
			check[n] = Math.max(dp(n-1) + arr[n], arr[n]);
			
			max = Math.max(check[n], max);
		}
		
		return check[n];

	}

	public static void main(String[] args) throws IOException {
		// 연속합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		check = new Integer[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		check[0] = arr[0];
		max = arr[0];
		
		dp(n - 1);
		
		System.out.println(max);
		
	}

}
