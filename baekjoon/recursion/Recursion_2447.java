package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Recursion_2447 {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new char[n][n];

		star(0, 0, n, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}

	static void star(int x, int y, int N, boolean blank) {

		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		if (N == 1) {
			arr[x][y] = '*';
			return;
		}

		int size = N / 3;
		int count = 0;
		
		for (int i = x; i < x + N; i += size) {
			
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) {
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
			
		}
		
	}
}
