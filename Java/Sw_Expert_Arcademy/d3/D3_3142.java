package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_3142 {

	public static void main(String[] args) throws IOException {
		// 영준이와 신비한 뿔의 숲
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int x = n - m; // 트원혼
			int y = m - x; // 유니콘
			
			System.out.println("#" + test + " " + y + " " + x);
		}
	}

}
