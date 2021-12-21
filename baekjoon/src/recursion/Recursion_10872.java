package recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Recursion_10872 {
	
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}

	public static void main(String[] args) throws IOException {
		// ÆÑÅä¸®¾ó
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = factorial(n);
		
		System.out.println(sum);
		
		br.close();
	}

}
