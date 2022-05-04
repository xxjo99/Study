package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1974 {

	public static void main(String[] args) throws IOException {
		// 스도쿠 검증
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			// 9 * 9 스도쿠 생성
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 체크
			Loop1: while (true) {

				// 행체크
				for (int i = 0; i < 9; i++) {
					boolean[] row = { false, false, false, false, false, false, false, false, false };
					for (int j = 0; j < 9; j++) {
						int n = arr[i][j];
						if (row[n - 1] == false) {
							row[n - 1] = true;
						} else {
							System.out.println("#" + test + " 0");
							break Loop1;
						}
					}
				}

				// 열체크
				for (int i = 0; i < 9; i++) {
					boolean[] colunm = { false, false, false, false, false, false, false, false, false };
					for (int j = 0; j < 9; j++) {
						int n = arr[j][i];
						if (colunm[n - 1] == false) {
							colunm[n - 1] = true;
						} else {
							System.out.println("#" + test + " 0");
							break Loop1;
						}
					}
				}

				// 3 * 3 격자 체크
				for (int i = 0; i <= 6; i += 3) {
					for (int j = 0; j <= 6; j += 3) {
						boolean[] square = { false, false, false, false, false, false, false, false, false };
						
						for (int k = i; k < i + 3; k++) {
							for (int l = j; l < j + 3; l++) {
								int n = arr[k][l];
								if (square[n-1] == false) {
									square[n-1] = true;
								} else {
									System.out.println("#" + test + " 0");
									break Loop1;
								}
							}
						}
						
					}
				}
				
				System.out.println("#" + test + " 1");
				break;

			}

		}
	}

}
