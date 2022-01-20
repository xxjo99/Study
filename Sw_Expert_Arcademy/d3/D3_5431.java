package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_5431 {

	public static void main(String[] args) throws IOException {
		// 민석이의 과제 체크하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			boolean[] boo = new boolean[n];
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < k; i++) {
				int a = Integer.parseInt(st.nextToken());
				boo[a-1] = true;
			}
			
			System.out.print("#" + tc + " ");
			for (int i = 0; i < boo.length; i++) {
				if (boo[i] == false) {
					System.out.print(i+1 + " ");
				}
			}
			
			
		}

	}

}
