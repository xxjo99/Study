package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_6718 {

	public static void main(String[] args) throws IOException {
		// 희성이의 원근법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			double n = Integer.parseInt(br.readLine());
			double f = n / 1000;

			int result = 0;
			if (f < 0.1) {
				result = 0;
			} else if (f >= 0.1 && f < 1) {
				result = 1;
			} else if (f >= 1 && f < 10) {
				result = 2;
			} else if (f >= 10 && f < 100) {
				result = 3;
			} else if (f >= 100 && f < 1000) {
				result = 4;
			} else {
				result = 5;
			}

			System.out.println("#" + tc + " " + result);
		}

	}

}
