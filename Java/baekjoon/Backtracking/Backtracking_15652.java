package backtracking;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Backtracking_15652 {

	static int n;
	static int m;
	static int[] arr;

	public static void dfs(int a, int depth) {
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = a; i <= n; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		// N과 M (4)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];

		dfs(1, 0);

	}

}
