package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1260 {

	static int[][] check; // 간선 연결상태
	static boolean[] checked; // 확인 여부
	static int n; // 정점개수
	static int m; // 간선개수
	static int v; // 시작정점

	public static void DFS(int v) {

		checked[v] = true;
		System.out.print(v + " ");

		for (int i = 1; i <= n; i++) {
			if (check[v][i] == 1 && checked[i] == false) {
				DFS(i);
			}
		}
	}

	public static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		checked[v] = true;

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			System.out.print(temp + " ");

			for (int i = 1; i <= n; i++) {
				if (check[temp][i] == 1 && checked[i] == false) {
					queue.add(i);
					checked[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// DFS와 BFS
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		check = new int[n + 1][n + 1];
		checked = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			check[a][b] = 1;
			check[b][a] = 1;
		}
		DFS(v);
		System.out.println();

		checked = new boolean[n + 1];
		BFS(v);

	}

}
