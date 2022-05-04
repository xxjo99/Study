package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1946 {

	public static void main(String[] args) throws IOException {
		// 압축풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());

			char[] c = new char[n];
			int[] num = new int[n];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				c[i] = st.nextToken().charAt(0);
				num[i] = Integer.parseInt(st.nextToken());
			}

			System.out.println("#" + test);
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < num[i]; j++) {
					System.out.print(c[i]);
					count++;
					if (count == 10) {
						System.out.println();
						count = 0;
					}
				}

			}
			System.out.println();
		}

	}

}
