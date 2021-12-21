package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D1_2025 {

	public static void main(String[] args) throws IOException {
		// N¡Ÿ µ°º¿
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
