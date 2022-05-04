package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_9317 {

	public static void main(String[] args) throws IOException {
		// 석찬이의 받아쓰기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			String s1 = br.readLine();
			String s2 = br.readLine();
			int count = 0;
			
			for (int i = 0; i < n; i++) {
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(i);
				
				if (c1 == c2) {
					count++;
				}
			}
			
			
			System.out.printf("#%d %d\n", test, count);
		}
	}

}
