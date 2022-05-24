package backtracking;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Backtracking_15649 {
	
	public static int[] arr;
	public static boolean[] visit;
	
	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visit[i] = false;
			}
		}
		
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		// N과 M (1)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		arr = new int[m];
		visit = new boolean[n];

		dfs(n, m, 0);

	}

}
