package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_1986 {

	public static void main(String[] args) throws IOException {
		// 지그재그 숫자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					sum -= i;
				} else {
					sum += i;
				}
			}
			
			System.out.println("#" + test + " " + sum);
			
		}
		
	}

}
