package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bruteforce_1748 {

	public static void main(String[] args) throws IOException {
		// 수 이어 쓰기 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int count = 0;
		int plus = 1;
		int num = 10;

		for (int i = 1; i <= n; i++) {
			if (i % num == 0) {
				plus++;
				num *= 10;
			}
			count += plus;

		}
		System.out.println(count);

	}

}
