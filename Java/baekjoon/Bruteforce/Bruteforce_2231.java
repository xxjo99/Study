package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bruteforce_2231 {

	public static void main(String[] args) throws IOException {
		// 분해합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int result = 0;

		for (int i = 0; i < n; i++) {
			int num = i;
			int sum = 0;
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum + i == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
