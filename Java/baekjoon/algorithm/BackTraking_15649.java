package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackTraking_15649 {

	static int arr[]; // 숫자저장
	static boolean chk[]; // 탐색여부 저장
	static StringBuilder sb = new StringBuilder();

	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (chk[i] == false) {
				chk[i] = true;
				arr[depth] = i;
				dfs(n, m, depth+1);
				chk[i] = false;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		chk = new boolean[n + 1];

	}

}
