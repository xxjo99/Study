package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_10250 {

	public static void main(String[] args) throws IOException {
		// ACM ȣ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			int a, b;

			if (n % h == 0) {
				b = h * 100;
				a = n / h;
			} else {
				b = (n % h) * 100;
				a = (n / h) + 1;
			}

			int XXYY = b + a;
			System.out.println(XXYY);

			br.close();
		}
	}

}
