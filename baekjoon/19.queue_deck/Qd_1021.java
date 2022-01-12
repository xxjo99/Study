package queue_deck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Qd_1021 {

	public static void main(String[] args) throws IOException {
		// 회전하는 큐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Integer> deque = new LinkedList<>();

		int count = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++) {
			deque.offer(i);
		}

		int[] arr = new int[k];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < k; i++) {
			int t = deque.indexOf(arr[i]);
			int idx;

			if (deque.size() % 2 == 0) {
				idx = deque.size() / 2 - 1;
			} else {
				idx = deque.size() / 2;
			}

			if (t <= idx) {
				for (int j = 0; j < t; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			} else {
				for (int j = 0; j < deque.size() - t; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}

			}
			deque.pollFirst();
		}
		
		System.out.println(count);

	}

}
