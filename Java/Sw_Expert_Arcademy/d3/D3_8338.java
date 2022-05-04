package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class D3_8338 {

	public static void main(String[] args) throws IOException {
		// °è»ê±â
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int result = 0;
			int a = arr[0] + arr[1];
			int b = arr[0] * arr[1];
			if (a > b) {
				result = a;
			} else {
				result = b;
			}

			for (int i = 2; i < arr.length; i++) {
				int sum = result + arr[i];
				int mul = result * arr[i];

				if (sum > mul) {
					result = sum;
				} else {
					if (result == 0) {
						result = 1 * mul;
					} else {
						result = mul;
					}
				}
			}

			System.out.printf("#%d %d", test, result);

		}
	}

}
