package queue_deck;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.IOException;

public class Qd_10845 {

	public static void main(String[] args) throws IOException {
		// 큐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			
			switch(s) {
			
			case "push":
				int num = Integer.parseInt(st.nextToken());
				q.add(num);
				a = num;
				break;
				
			case "pop":
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(q.remove() + "\n");
				}
				break;
				
			case "size":
				sb.append(q.size() + "\n");
				break;
				
			case "empty":
				if (q.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;
				
			case "front":
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(q.peek() + "\n");
				}
				break;
				
			case "back":
				if (q.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(a + "\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}

}
