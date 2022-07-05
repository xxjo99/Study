package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_1918 {

	public static int priority(char operator) {

		if (operator == '(' || operator == ')') {
			return 0;
		} else if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		// 후위 표기식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			switch (c) {
			case '+':
			case '-':
			case '*':
			case '/':
				while (!stk.isEmpty() && priority(stk.peek()) >= priority(c)) {
					sb.append(stk.pop());
				}
				stk.add(c);
				break;

			case '(':
				stk.add(c);
				break;

			case ')':
				while (!stk.isEmpty() && stk.peek() != '(') {
					sb.append(stk.pop());
				}
				stk.pop();
				break;

			default:
				sb.append(c);
			}
		}

		while (!stk.isEmpty()) {
			sb.append(stk.pop());
		}

		System.out.println(sb.toString());

	}

}
