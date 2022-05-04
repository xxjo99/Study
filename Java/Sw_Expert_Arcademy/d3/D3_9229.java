package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_9229 {

	public static void main(String[] args) throws IOException {
		// ÇÑºóÀÌ¿Í Spot Mart
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];

			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int max = -1;
			Loop1: for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					int sum = arr[i] + arr[j];

					if (sum > max && sum <= m) {
						max = sum;
						if (max == m) {
							break Loop1;
						}
					}

				}
			}
			
			System.out.printf("#%d %d\n", test, max);

		}
	}

}
