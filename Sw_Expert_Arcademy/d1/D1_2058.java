package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D1_2058 {

	public static void main(String[] args) throws IOException {
		// 자릿수 더하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n =Integer.parseInt(br.readLine());
		int sum = 0;
		
		while (n != 0) {
			sum += n%10;
			n /= 10;
		}
		
		System.out.println(sum);
	}

}
