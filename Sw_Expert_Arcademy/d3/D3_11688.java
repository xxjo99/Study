package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_11688 {

	public static void main(String[] args) throws IOException {
		// Calkin-Wilf tree 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= t; tc++) {
			String s = br.readLine();
			int a = 1;
			int b = 1;
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if (c == 'L') {
					b = a + b;
				} else {
					a = a + b;
				}
			}
			
			System.out.printf("#%d %d %d\n", tc, a, b);
		}
	}

}
