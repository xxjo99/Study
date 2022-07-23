package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_9935 {

	public static void main(String[] args) throws IOException {
		// 문자열 폭발
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String boom = br.readLine();
		int len = boom.length();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));

			if (st.size() >= len) {
				boolean flag = true;

				for (int j = 0; j < len; j++) {
					if (st.get(st.size() - len + j) != boom.charAt(j)) {
						flag = false;
						break;
					}
				}

				if (flag) {
					for (int j = 0; j < len; j++) {
						st.pop();
					}
				}
			}

		}

		StringBuilder sb = new StringBuilder();
		for (Character c : st) {
			sb.append(c);
		}
		System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());

	}

}
