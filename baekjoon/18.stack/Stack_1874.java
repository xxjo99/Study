package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_1874 {

	public static void main(String[] args) throws IOException {
		// 스택 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int start = 0;
		
		while (n-- > 0) {
			int t = Integer.parseInt(br.readLine());
			
			if (t > start) {
				for (int i = start + 1; i <= t; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = t;
			} else if (stack.peek() != t) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
			
		}
		
		System.out.println(sb);

	}

}
