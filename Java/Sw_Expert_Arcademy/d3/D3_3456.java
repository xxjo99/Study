package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_3456 {

	public static void main(String[] args) throws IOException {
		// 직사각형 길이 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = 0;
			
			if (a == b) {
				d = c;
			} else if (a == c) {
				d = b;
			} else if (b == c) {
				d = a;
			}
			
			System.out.printf("#%d %d\n", test, d);
			
		}
		
	}
}
