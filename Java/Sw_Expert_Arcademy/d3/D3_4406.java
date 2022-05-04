package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_4406 {

	public static void main(String[] args) throws IOException {
		// 모음이 보이지 않는 사람
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					sb.append(c);
				}
			}

			System.out.println("#" + test + " " + sb.toString());
		}
	}

}
