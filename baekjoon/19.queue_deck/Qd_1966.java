package queue_deck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Qd_1966 {

	public static void main(String[] args) throws IOException {
		// 프린터 큐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 0; test < t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // 문서의 개수
			int k = Integer.parseInt(st.nextToken()); // 몇 번째로 인쇄되었는지 궁금한 문서
			int count = 0;

			Queue<int[]> queue = new LinkedList<>();
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(st1.nextToken());
				queue.add(new int[] { i, a });
			}

			while (!queue.isEmpty()) {
				int[] now = queue.poll();
				boolean able = true;
				
				for (int[] q : queue) {
					if (q[1] > now[1]) {
						able = false;
					}
				}

				if (able) {
					count++;
					if (now[0] == k) {
						break;
					}
				} else {
					queue.add(now);
				}
			}
			
			System.out.println(count);

		}

	}

}
