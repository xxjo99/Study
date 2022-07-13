package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class DynamicProgrammin_9184 {

	static int[][][] arr = new int[21][21][21];

	static int w(int a, int b, int c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if (a > 20 || b > 20 || c > 20) {
			return arr[20][20][20] = w(20, 20, 20);
		}

		if (a < b && b < c) {
			if (arr[a][b][c] != 0) {
				return arr[a][b][c];
			} else {
				return arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			}
		}

		if (arr[a][b][c] != 0) {
			return arr[a][b][c];
		} else {
			return arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		// 신나는 함수 실행
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) {
				break;
			}

			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));

		}

	}
}
