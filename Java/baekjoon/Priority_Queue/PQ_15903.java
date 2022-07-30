package Priority_Queue;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PQ_15903 {

	public static void main(String[] args) throws IOException {
		// 카드 합체 놀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			pq.offer(Long.parseLong(st.nextToken()));
		}
		
		for (int i = 0; i < m; i++) {
			long a = pq.poll();
			long b = pq.poll();
			long sum = a + b;
			pq.offer(sum);
			pq.offer(sum);
		}
		
		long sum = 0;
		while (pq.size() != 0) {
			sum += pq.poll();
		}
		System.out.println(sum);
	}
}
