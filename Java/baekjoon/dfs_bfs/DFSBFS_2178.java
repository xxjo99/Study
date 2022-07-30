package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_2178 {

	static int[][] map; // 미로배열
	static int N, M; // 미로크기

	static boolean[][] visited; // 거리체크

	static int[] dx = { -1, 1, 0, 0 }; // x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; // y방향배열-좌우

	public static void BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { x, y });

		while (!queue.isEmpty()) {
			int[] xy = queue.poll();

			for (int i = 0; i < 4; i++) { // 동, 서, 남, 북 탐색
				int nextX = xy[0] + dx[i];
				int nextY = xy[1] + dy[i];

				if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M || visited[nextX][nextY]
						|| map[nextX][nextY] == 0) {
					continue;
				}
				
				queue.add(new int[] { nextX, nextY });
				visited[nextX][nextY] = true;
				map[nextX][nextY] = map[xy[0]][xy[1]] + 1;
				
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// 숨바꼭질
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		BFS(0, 0);
		System.out.println(map[N - 1][M - 1]);

	}

}
