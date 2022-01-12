package queue_deck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Qd_1967 {

	public static void main(String[] args) throws IOException {
		// µ¦
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			
			if (a.equals("push_front")) {
				int b = Integer.parseInt(st.nextToken());
				deque.addFirst(b);
			} else if (a.equals("push_back")) {
				int b = Integer.parseInt(st.nextToken());
				deque.addLast(b);
			} else if (a.equals("pop_front")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollFirst());
				}
			} else if (a.equals("pop_back")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollLast());
				}
			} else if (a.equals("size")) {
				System.out.println(deque.size());
			} else if (a.equals("empty")) {
				if (deque.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (a.equals("front")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekFirst());
				}
			} else if (a.equals("back")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
			}
		}

	}

}
