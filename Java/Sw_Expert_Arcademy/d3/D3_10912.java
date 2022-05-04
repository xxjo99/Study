package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_10912 {

	public static void main(String[] args) throws IOException {
		// 외로운 문자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			char[] s = br.readLine().toCharArray();
			int[] check = new int['z' + 1];
			StringBuilder ans = new StringBuilder();
			
			for (int i = 0; i < s.length; i++) {
				check[s[i]]++;
			}
			
			for (int i = 'a'; i <= 'z'; i++) {
				if (check[i] % 2 != 0)
					ans.append(Character.toString((char) i));
			}
			
			if (ans.length() == 0)
				sb.append("#" + tc + " Good\n");
			else
				sb.append("#" + tc + " " + ans + "\n");
		}
		System.out.println(sb);
	}

}
