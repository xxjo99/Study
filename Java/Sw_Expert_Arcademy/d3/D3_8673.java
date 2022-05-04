package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_8673 {

	public static void main(String[] args) throws IOException {
		// 코딩 토너먼트1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int k = Integer.parseInt(br.readLine());
			int[] players = new int[1 << k];
			int result = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 1 << k; i++) {
				players[i] = Integer.parseInt(st.nextToken());
			}
			
            while (k > 0) {
                int[] survived = new int[1 << (k - 1)];

                for (int i = 0; i < 1 << k; i += 2) {
                    survived[i / 2] = Math.max(players[i], players[i + 1]);
                    result += Math.abs(players[i] - players[i + 1]);
                }

                players = survived;
                k--;
            }


			System.out.println("#" + test + " " + result);
		}
	}

}
