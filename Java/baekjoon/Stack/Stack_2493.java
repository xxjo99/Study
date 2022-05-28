package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Stack_2493 {

	public static void main(String[] args) throws IOException {
		// 탑
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<int[]> stack = new Stack<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			while (!stack.isEmpty()) {
				
				if (stack.peek()[1] >= a) {
					System.out.print(stack.peek()[0] + " ");
					break;
				}
				
				stack.pop();
			}
			
			if (stack.isEmpty()) {
				System.out.print("0 ");
			}
			
			stack.push(new int[] { i, a });
		}

	}

}
