package setAndMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class SM_14425 {
	public static void main(String[] args) throws IOException {
		// 문자열 집합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), 1);
		}
		
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (map.get(str) != null) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}
}
