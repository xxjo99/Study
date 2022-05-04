package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class D3_7087 {

	public static void main(String[] args) throws IOException {
		// 문제 제목 붙이기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int N = Integer.parseInt(br.readLine());
			String[] words = new String[N];
			int count = 0;
			int checkFirstWord = 65;

			for (int i = 0; i < words.length; i++) {
				words[i] = br.readLine();
			}
			Arrays.sort(words);

			for (int i = 0; i < words.length; i++) {

				if ((int) words[i].charAt(0) == checkFirstWord) {
					count++;
					checkFirstWord++;
				}

			}

			System.out.println("#" + tc + " " + count);
		}

	}

}
