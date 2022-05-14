package Priority_Queue;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PQ_1927 {
	
	public static void main(String[] args) throws IOException{
		// ÃÖ¼Ò Èü
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x == 0) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println(0);
				}
				continue;
			}
			
			queue.add(x);
			
		}
		
		
	}

}
