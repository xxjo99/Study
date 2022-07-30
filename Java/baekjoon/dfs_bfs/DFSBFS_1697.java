package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS_1697 {
	
	static int N; // 시작 노드
	static int K; // 도착 노드
	
	static int[] visited = new int[100001];
	
	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		visited[node] = 1;
		
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			
			for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }
                
                if (next == K) {
                	System.out.println(visited[temp]);
                	return;
                }
                
                if (next >= 0 && next < visited.length && visited[next] == 0) {
                	queue.add(next);
                	visited[next] = visited[temp] + 1;
                }
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// 숨바꼭질
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		if (N == K) {
            System.out.println(0);
        } else {
        	BFS(N);
        }

	}

}
