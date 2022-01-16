package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class D3_8931 {

	public static void main(String[] args) throws IOException {
		// Á¦·Î
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<>();
			
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(br.readLine());
				
				if (a != 0) {
					stack.add(a);
				} else {
					stack.pop();
				}
			}
			
			int sum = 0;
			for (int i = 0; i < stack.size(); i++) {
				sum += stack.get(i);
			}
			
			System.out.printf("#%d %d\n", test, sum);
			
		}
		
		
	}

}
