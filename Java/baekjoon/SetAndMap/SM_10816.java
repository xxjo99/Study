package setAndMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class SM_10816 {
	public static void main(String[] args) throws IOException {
		// 숫자 카드 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());

			if (hash.get(a) == null) {
				hash.put(a, 1);
			} else {
				hash.put(a, hash.get(a) + 1);
			}
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if (hash.get(a) == null) {
				sb.append(0).append(" ");
			} else {
				sb.append(hash.get(a)).append(" ");
			}
		}
		
		System.out.println(sb);

	}
}
