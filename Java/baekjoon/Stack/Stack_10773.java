package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_10773 {

	public static void main(String[] args) throws IOException {
		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();

		int k = Integer.parseInt(br.readLine());

		for (int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				stack.pop();
			} else {
				stack.push(n);
			}
		}
		int sum = 0;
		for (int e : stack) {
			sum += e;
		}

		System.out.println(sum);

	}

}
