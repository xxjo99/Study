package function;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Function_1065 {

	public static int arithmetic_sequence(int n) {
		int count = 99;

		if (n < 100) {
			return n;
		} else {
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) throws IOException {
		// 한수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(arithmetic_sequence(n));

	}

}
