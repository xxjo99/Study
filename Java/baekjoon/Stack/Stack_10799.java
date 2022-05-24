package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_10799 {

	public static void main(String[] args) throws IOException {
		// 쇠막대기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (stack.pop() == i-1) {
					result += stack.size();
				} else {
					result += 1;
				}
			}
		}
		
		System.out.println(result);
	}

}
