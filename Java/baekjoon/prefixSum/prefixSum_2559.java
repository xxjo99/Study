package prefixSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class prefixSum_2559 {
	
	public static void main(String[] args) throws IOException {
		// 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= n - k; i++) {
			int sum = 0;

			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}

		System.out.println(max);

	}

}
