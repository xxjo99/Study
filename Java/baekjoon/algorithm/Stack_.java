package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_ {
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {
			String s = arr[i];
			Stack<Character> stk = new Stack<>();
			String check = "YES";
			
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if (c == '(') {
					stk.push(c);
				} else {
					if (stk.isEmpty() == true) {
						check = "NO";
						break;
					} else {
						stk.pop();
					}
				}
				
			}
			
			if (check == "YES" && stk.isEmpty() == false) {
				check = "NO";
			}
			
			System.out.println(check);
		}
		
	}

}
