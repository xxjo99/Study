package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_11387 {

	public static void main(String[] args) throws IOException {
		// 몬스터 사냥
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long d = Integer.parseInt(st.nextToken());
			long l = Integer.parseInt(st.nextToken());
			long n = Integer.parseInt(st.nextToken());
			
			long result = (d * n) + ((n - 1) * n * l * d) / 200;
			System.out.println("#" + tc + " " + result);
		}
	}

}
