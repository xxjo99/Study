package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math2_4948 {

	public static void main(String[] args) throws IOException {
		// 베르트랑 공준
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}

			boolean[] arr = new boolean[2 * n + 1];
			arr[0] = true;
			arr[1] = true;
			
			for (int i = 2; i <= Math.sqrt(2*n+1); i++) {
				for (int j = i*i; j < 2*n+1; j += i) {
					arr[j] = true;
				}
			}
			
			int count = 0;
			for (int i = n+1; i< 2*n+1; i++) {
				if (arr[i] == false) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}

	}

}
