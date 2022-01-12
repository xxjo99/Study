package queue_deck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Qd_2164 {

	public static void main(String[] args) throws IOException {
		// ī��2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());

	}

}
