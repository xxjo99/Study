package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_5601 {

	public static void main(String[] args) throws IOException {
		// [Professional] Áê½º ³ª´©±â
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.print("#" + test);
			for (int i = 1; i <= n; i++) {
				System.out.print(" " + 1 + "/" + n);
			}
			System.out.println();

		}

	}

}
