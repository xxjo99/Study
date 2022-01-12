package queue_deck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Qd_10866 {

	public static void main(String[] args) throws IOException {
		// Ä«µå2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (queue.size() > 1) {
			
			for (int i = 0; i < k - 1; i++) {
				int a = queue.poll();
				queue.add(a);
			}
			
			sb.append(queue.poll()).append(", ");
		}
		
		sb.append(queue.poll()).append(">");
		
		System.out.println(sb);
	}

}
