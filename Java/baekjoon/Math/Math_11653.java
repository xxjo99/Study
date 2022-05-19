package math2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math2_11653 {

	public static void main(String[] args) throws IOException {
		// 소인수 분해
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 2;
		
		while (n != 1) {
			if (n % x == 0) {
				System.out.println(x);
				n = n / x;
			} else  {
				x++;
			}
		}
		
	}
}