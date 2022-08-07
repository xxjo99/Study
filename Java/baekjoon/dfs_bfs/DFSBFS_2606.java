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

public class DFSBFS_2606 {

	public static boolean[] visited;
	static List<List<Integer>> list = new ArrayList<>();

	static int n;
	static int m;

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			int a = q.poll();

			for (int i = 0; i < list.get(a).size(); i++) {
				int nextV = list.get(a).get(i);

				if (visited[nextV] != false) {
					continue;
				}

				q.offer(nextV);
				visited[nextV] = true;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// 바이러스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		visited = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			list.add(new ArrayList<>());

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			list.get(A).add(B);
			list.get(B).add(A);
		}

		for (int i = 1; i <= n; i++) {
			Collections.sort(list.get(i));
		}

		bfs(1);
		
		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == true) {
				count++;
			}
		}
		
		System.out.println(count - 1);

	}

}
