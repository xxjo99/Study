package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_17413 {

	public static void main(String[] args) throws IOException {
		// 단어 뒤집기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stk = new Stack<>();
		boolean check = false;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '<') {
				while (!stk.isEmpty()) {
					sb.append(stk.pop());
				}
				check = true;

			} else if (s.charAt(i) == '>') {
				check = false;
				sb.append(s.charAt(i));
				continue;
			}

			if (check == true) {
				sb.append(s.charAt(i));
			} else if (check == false) {
				if (s.charAt(i) == ' ') {
					while (!stk.isEmpty()) {
						sb.append(stk.pop());
					}
					sb.append(' ');
					continue;
				} else {
					stk.push(s.charAt(i));
				}
			}

			if (i == s.length() - 1) {
				while (!stk.isEmpty()) {
					sb.append(stk.pop());
				}
			}
		}

		System.out.println(sb);

	}

}
