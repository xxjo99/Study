package recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Recursion_10870 {
	
	static int fibonacci(int N) {
		if (N == 0)	return 0;
		if (N == 1)	return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
 
	public static void main(String[] args) throws IOException {
		// 피보나치 수 5
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		System.out.println(fibonacci(N));
		
		br.close(); 
	}
}