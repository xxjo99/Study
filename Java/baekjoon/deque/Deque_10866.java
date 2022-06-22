package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Deque_10866 {

	public static Deque<Integer> deque = new ArrayDeque<>();
	
	private static void push_front(int x) {
		deque.addFirst(x);
	}
	
	private static void push_back(int x) {
		deque.addLast(x);
	}
	
	private static int pop_front() {
		try {
			int n = deque.removeFirst();
			return n;
		} catch (Exception e) {
			return -1;
		}
	}
	
	private static int pop_back() {
		try {
			int n = deque.removeLast();
			return n;
		} catch (Exception e) {
			return -1;
		}
	}
	
	private static int size() {
		return deque.size();
	}
	
	private static int empty() {
		int n = deque.size();
		
		if (n == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private static int front() {
		try {
			int n = deque.getFirst();
			return n;
		} catch (Exception e) {
			return -1;
		}
	}
	
	private static int back() {
		try {
			int n = deque.getLast();
			return n;
		} catch (Exception e) {
			return -1;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
				
			case "push_back":
				push_back(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop_front" :
				sb.append(pop_front()).append('\n');
				break;
				
			case "pop_back":
				sb.append(pop_back()).append('\n');
				break;
				
			case "size":
				sb.append(size()).append('\n');
				break;
				
			case "empty":
				sb.append(empty()).append('\n');
				break;
				
			case "front":
				sb.append(front()).append('\n');
				break;
				
			case "back":
				sb.append(back()).append('\n');
				break;
			}
			
		}
		
		System.out.println(sb);
		
		
	}

}
