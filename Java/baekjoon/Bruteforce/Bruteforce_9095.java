package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bruteforce_9095 {

	static int search(int[] arr, int n, int m) {
		int result = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];

					if (sum == m) {
						return sum;
					}

					if (result < sum && sum < m) {
						result = sum;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		// 블랙잭
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = search(arr, n, m);
		System.out.println(result);

		br.close();
	}

}
