package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_1954 {

	public static void main(String[] args) throws IOException {
		// 날짜 계산기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 1) {
				System.out.printf("#%d\n", test);
				System.out.println(1);
				continue;
			}

			int x = 0;
			int y = 0;

			int dir = 0;
			int[][] arr = new int[n][n];

			for (int i = 0; i < n * n; i++) {
				arr[x][y] = i + 1;
				x += dx[dir];
				y += dy[dir];

				if (x < 0 || x >= n || y < 0 || y >= n) {
					x -= dx[dir];
					y -= dy[dir];

					dir = (dir + 1) % 4;

					x += dx[dir];
					y += dy[dir];
				}

				if (arr[x][y] != 0) {
					x -= dx[dir];
					y -= dy[dir];

					dir = (dir + 1) % 4;
					
					x += dx[dir];
					y += dy[dir];
				}
			}
			System.out.printf("#%d\n", test);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
