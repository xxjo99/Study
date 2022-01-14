package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_11315 {

	static int N;
	static char[][] stage;

	static int[] dc = { 1, 1, 0, -1 };
	static int[] dr = { 0, 1, 1, 1 };

	public static boolean checkO(int i, int j) {
		for (int d = 0; d < 4; d++) {
			for (int k = 1; k <= 4; k++) {
				if (!(i + dr[d] * k >= 0 && i + dr[d] * k < N && j + dc[d] * k >= 0 && j + dc[d] * k < N
						&& stage[i + dr[d] * k][j + dc[d] * k] == 'o'))
					break;
				if (k == 4)
					return true;
			}
		}

		return false;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			stage = new char[N][N];

			for (int i = 0; i < N; i++)
				stage[i] = br.readLine().toCharArray(); // 'o':µ¹ÀÌ ÀÖ´Â Ä­, '.':µ¹ÀÌ ¾ø´Â Ä­

			boolean check = false;
			loop: for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (stage[i][j] == 'o' && checkO(i, j)) {
						check = true;
						break loop;
					}
				}
			}

			if (check)
				System.out.println("#" + t + " YES");
			else
				System.out.println("#" + t + " NO");
		}
	}
}
