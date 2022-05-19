package setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class SM_1269 {

	public static void main(String[] args) throws IOException {
		// 대칭 차집합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashSet<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if (set.contains(a)) {
				set.remove(a);
			} else {
				set.add(a);
			}
			
		}

		System.out.println(set.size());

	}
}