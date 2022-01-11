package num_combinatorics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NC_1010 {

	public static double solve(double m, double n) {
		double a = 1;
		double b = 1;

		for (double i = m; i > m - n; i--) {
			a = a * i;
		}

		for (double i = n; i > 0; i--) {
			b = b * i;
		}

		return a / b;
	}

	public static void main(String[] args) throws IOException {
		// 다리놓기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double n = Double.parseDouble(st.nextToken());
			double m = Double.parseDouble(st.nextToken());

			System.out.printf("%.0f\n", solve(m, n));
		}
	}

}