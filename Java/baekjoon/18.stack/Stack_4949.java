package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_4949 {

	public static void main(String[] args) throws IOException {
		// ±ÕÇüÀâÈù ¼¼»ó
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s = br.readLine();
			if (s.equals(".")) {
				break;
			}

			Stack<Character> stk = new Stack<>();

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if (c == '(' || c == '[') {
					stk.push(c);
				} else if (c == ')' || c == ']') {
					
					if (stk.isEmpty() || (stk.peek() == '(' && c == ']') || (stk.peek() == '[' && c == ')')) {
						stk.push(c);
						break;
					}
					
					stk.pop();

				}
				
			}
			
			if (!stk.isEmpty()) {			
				System.out.println("no");
			}
			else {
				System.out.println("yes");				
			}

		}

	}

}
