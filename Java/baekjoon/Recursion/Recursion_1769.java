package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Recursion_1769 {
	
	static int count = 0;
	
	private static String recur(String x) {
		int sum = 0;
		
		if (x.length() > 1) {
			for (int i = 0; i < x.length(); i++) {
				char a = x.charAt(i);
				sum += Integer.parseInt(String.valueOf(a));
			}
			count++;
			return recur(Integer.toString(sum));
		} else {
			return x;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// 3의 배수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String x = br.readLine();
		
		int result = Integer.parseInt(recur(x));
		
		System.out.println(count);
		if (result % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}		
	}

}
