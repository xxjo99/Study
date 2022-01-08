package stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_9012 {

	public static void main(String[] args) throws IOException {
		// °ýÈ£
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while (n > 0) {
			String data = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			boolean check = true;
			for (int i = 0; i < data.length(); i++) {
				char c = data.charAt(i);
				
				if (c == '(') {
					stack.push(c);
				} else {
					if (stack.empty()) {
						check = false;
						break;
					} else {
						stack.pop();
					}
				}
			}
			
			if (!stack.empty() || check == false) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			
			n--;
		}
	
	}

}
