package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class DFSBFS_24479 {

	public static int[] visited;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	static int n;
	static int m;
	static int r;
	static int count = 1;

	public static void dfs(int x) {
		visited[x] = count;

		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);

			if (visited[y] == 0) {
				count++;
				dfs(y);
			}

		}
	}

	public static void main(String[] args) throws IOException {
		// 알고리즘 수업 - 깊이 우선 탐색 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		for (int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i));
		}

		count = 1;
		visited = new int[n + 1];
		dfs(r);
		for (int i = 0; i < visited.length; i++) {
			if (i != 0)
				System.out.println(visited[i]);
		}
	}

}
