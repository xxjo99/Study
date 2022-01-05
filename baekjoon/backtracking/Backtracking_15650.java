package backtracking;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Backtracking_15650 {
	
	public static int[] arr;
	public static int n;
	public static int m;
	
	public static void dfs (int at, int depth) {
		if (depth == m) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = at; i <= n; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		// N°ú M (2)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(1, 0);
	}

}
