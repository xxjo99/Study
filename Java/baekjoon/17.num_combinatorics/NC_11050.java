package num_combinatorics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NC_11050 {

	static int factorial(int a) {
		if (a <= 1) {
			return 1;
		} else {
			return factorial(a - 1) * a;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// 이항계수1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int result = factorial(n) / (factorial(n-k) * factorial(k));
		System.out.println(result);
	}

}