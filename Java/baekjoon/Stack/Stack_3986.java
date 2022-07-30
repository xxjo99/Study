package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_3986 {

	public static void main(String[] args) throws IOException {
		// 좋은 단어
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		for (int t = 0; t < n; t++) {
			String s = br.readLine();
			
			Stack<Character> stk = new Stack<>();
			
			char first = s.charAt(0);
			stk.push(first);
			
			for (int i = 1; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if (stk.isEmpty() || stk.peek() != c) {
					stk.push(c);
				} else {
					stk.pop();
				}
				
			}
			
			if (stk.isEmpty() == true) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
