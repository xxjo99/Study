package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math2_9020 {

	public static void main(String[] args) throws IOException {
		// ∞ÒµÂπŸ»Â¿« √ﬂ√¯
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] arr = new boolean[10001];
		arr[0] = true;
		arr[1] = true;

		for (int i = 2; i * i <= 10000; i++) {
			if (!arr[i]) {
				for (int j = i * i; j <= 10000; j += i) {
					arr[j] = true;
				}
			}
		}

		int t = Integer.parseInt(br.readLine());
		for (int test = 0; test < t; test++) {
			int n = Integer.parseInt(br.readLine());
			int temp = n / 2;

			for (int j = temp; j >= 2; j--) {
				if (arr[j] == false && arr[n - j] == false) {
					System.out.println(j + " " + (n - j));
					break;
				}
			}

		}

	}

}
