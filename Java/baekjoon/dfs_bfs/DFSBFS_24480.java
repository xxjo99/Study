package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class DFSBFS_24480 {

	static List<List<Integer>> edge;
	static boolean visited[];
	static int vertex[], order;

	public static void dfs(int u) {
		visited[u] = true;
		vertex[u] = order++;
		for (int v : edge.get(u))
			if (!visited[v])
				dfs(v);
	}

	public static void main(String[] args) throws IOException {
		// 알고리즘 수업 - 깊이 우선 탐색 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int	r = Integer.parseInt(st.nextToken()) - 1;
		int u, v, i;
		
		edge = new ArrayList<>();
		for (i = 0; i < n; ++i) {
			edge.add(new ArrayList<>());
		}
		
		for (i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken()) - 1;
			v = Integer.parseInt(st.nextToken()) - 1;
			edge.get(u).add(v);
			edge.get(v).add(u);
		}
		br.close();

		for (i = 0; i < n; ++i) {
			Collections.sort(edge.get(i), (v1, v2) -> v2 - v1);
		}

		vertex = new int[n];
		order = 1;

		visited = new boolean[n];

		dfs(r);

		StringBuilder sb = new StringBuilder();
		for (int ver : vertex) {
			sb.append(ver + "\n");
		}
		System.out.println(sb.toString());
	}

}
