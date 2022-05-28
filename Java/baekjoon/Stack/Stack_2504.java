package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_2504 {

	public static void main(String[] args) throws IOException {
		// 괄호의값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int mul = 1;
		int result = 0;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {

			switch (input.charAt(i)) {

			case '(':
				stack.push('(');
				mul *= 2;
				break;

			case '[':
				stack.push('[');
				mul *= 3;
				break;

			case ')':
				if (stack.isEmpty() || stack.peek() != '(') {
					result = 0;
					break;
				}

				if (input.charAt(i - 1) == '(') {
					result += mul;
				}

				stack.pop();
				mul /= 2;
				break;

			case ']':
				if (stack.isEmpty() || stack.peek() != '[') {
					result = 0;
					break;
				}

				if (input.charAt(i - 1) == '[') {
					result += mul;
				}

				stack.pop();
				mul /= 3;
				break;
				
			}
		}
		
		System.out.println(!stack.isEmpty() ? 0 : result);

	}

}
