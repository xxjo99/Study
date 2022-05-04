package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class D3_8658 {

	public static void main(String[] args) throws IOException {
		// Summation
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int[] arr = new int[10];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = -1;
			int min = 10000;
			for (int i = 0; i < 10; i++) {
				int a = arr[i];
				int sum = 0;
				
				while (a > 0) {
					sum += a % 10;
					a /= 10;
				}
				
				if (sum > max) {
					max = sum;
				}
				if (sum < min) {
					min = sum;
				}
			}
			
			System.out.printf("#%d %d %d\n", test, max, min);
			
		}
	}

}
