package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_6730 {

	public static void main(String[] args) throws IOException {
		// 장애물 경주 난이도 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int up = 0;
			int down = 0;
			for (int i = 0; i < n - 1; i++) {
				int a = arr[i];
				int b = arr[i + 1];
				
				if (a < b) {
					int c = b - a;
					if (up < c) {
						up = c;
					}
				} else if (a > b) {
					int c = a - b;
					if (down < c) {
						down = c;
					}
				}
			}
			

			System.out.println("#" + tc + " " + up + " " + down);
		}

	}

}
