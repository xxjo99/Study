package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_13218 {

	public static void main(String[] args) throws IOException {
		// 조별과제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int answer = 0;
			
			if (n < 3) {
				answer = 0;
			} else {
				answer = n / 3;
			}

			System.out.printf("#%d %d\n", test, answer);

		}

	}

}
