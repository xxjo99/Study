package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_3431 {

	public static void main(String[] args) throws IOException {
		// 준환이의 운동관리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int l = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			if (x < l) {
				answer = l - x;
			} else if (x > u) {
				answer = -1;
			}
			
			System.out.println("#" + test + " " + answer);
		}

	}

}
