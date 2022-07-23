package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Stack_5397 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		String[] input;

		for (int i = 0; i < T; i++) {
			Stack<String> left = new Stack<>();
			Stack<String> right = new Stack<>();
			input = br.readLine().split("");

			for (String str : input) {
				switch (str) {
				case "<":
					if (!left.isEmpty()) {
						right.push(left.pop());
					}
					break;

				case ">":
					if (!right.isEmpty()) {
						left.push(right.pop());
					}
					break;

				case "-":
					if (!left.isEmpty()) {
						left.pop();
					}
					break;

				default:
					left.push(str);
				}
			}

			while (!left.isEmpty()) {
				right.push(left.pop());
			}
			while (!right.isEmpty()) {
				sb.append(right.pop());
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}
}