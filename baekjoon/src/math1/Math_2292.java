package math1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_2292 {

	public static void main(String[] args) throws IOException {
		// ¹úÁý
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		
		if (n == 1) {
			System.out.println(n);
		} else {
			while (range <= n) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}

}
