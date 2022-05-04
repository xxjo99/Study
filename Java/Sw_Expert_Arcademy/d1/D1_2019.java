package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D1_2019 {

	public static void main(String[] args) throws IOException {
		// 더블더블
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(result + " ");
			result *= 2;
		}
		
		System.out.print(result);
	}

}
