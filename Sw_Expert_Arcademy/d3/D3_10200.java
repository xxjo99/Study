package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class D3_10200 {

	public static void main(String[] args) throws IOException {
		// 구독자 전쟁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int result1 = (a > b) ? b : a;
			
			int result2 = 0;
			int sum = a + b;
			
			if (sum < n) {
				result2 = 0;
			} else {
				result2 = sum - n;
			}
			
			
			System.out.printf("#%d %d %d\n", test, result1, result2);
		}
	}

}
