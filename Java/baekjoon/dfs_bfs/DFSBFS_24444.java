package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DFSBFS_24444 {

	public static int[] visited;
	static List<List<Integer>> list = new ArrayList<>();

	static int n;
	static int m;

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		int cnt = 1;

		q.offer(start);
		visited[start] = cnt++;

		while (!q.isEmpty()) {
			int a = q.poll();

			for (int i = 0; i < list.get(a).size(); i++) {
				int nextV = list.get(a).get(i);

				if (visited[nextV] != 0)
					continue;

				q.offer(nextV);
				visited[nextV] = cnt++;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// 알고리즘 수업 - 너비 우선 탐색 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		visited = new int[n + 1];
		for (int i = 0; i <= n; i++)
			list.add(new ArrayList<>());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			list.get(A).add(B);
			list.get(B).add(A);
		}

		for (int i = 1; i <= n; i++)
			Collections.sort(list.get(i));

		bfs(r);

		for (int i = 1; i <= n; i++)
			System.out.println(visited[i]);

	}

}
