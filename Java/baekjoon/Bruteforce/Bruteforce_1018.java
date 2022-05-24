package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bruteforce_1018 {

	public static boolean[][] arr;
	public static int min = 64;

	public static void find(int x, int y) {
		int endx = x + 8;
		int endy = y + 8;
		int count = 0;
		boolean tf = arr[x][y];

		for (int i = x; i < endx; i++) {
			for (int j = y; j < endy; j++) {

				if (arr[i][j] != tf) {
					count++;
				}

				tf = (!tf);
			}

			tf = !tf;
		}

		count = Math.min(count, 64 - count);

		min = Math.min(min, count);
	}

	public static void main(String[] args) throws IOException {
		// 체스판 다시 칠하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true; // W�� ���� true
				} else {
					arr[i][j] = false; // B�� ���� false
				}

			}
		}

		int row = n - 7;
		int col = m - 7;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);

	}

}
