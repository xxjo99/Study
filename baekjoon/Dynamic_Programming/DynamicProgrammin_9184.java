package Dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgrammin_9184 {

	static int[][][] arr = new int[51][51][51];

	static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if (a > 20 || b > 20 || c > 20) {
			arr[a][b][c] = w(20, 20, 20);
			return arr[a][b][c];
		}

		if (arr[a][b][c] != 0) {
			return arr[a][b][c];
		} else {
			if (a < b && b < c) {
				arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			} else {
				arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
			}
			return arr[a][b][c];
		}
	}

	public static void main(String[] args) throws IOException {
		// �ų��� �Լ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) {
				break;
			}

            if(a <= 0 || b <= 0 || c <= 0) {
                System.out.printf("w(%d, %d, %d) = %d \n", a, b, c, 1);
            }else {
                System.out.printf("w(%d, %d, %d) = %d \n", a, b, c, w(a, b, c));
            }
		}

	}

}
