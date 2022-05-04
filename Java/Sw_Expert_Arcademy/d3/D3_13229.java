package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_13229 {

	public static void main(String[] args) throws IOException {
		// ¿œø‰¿œ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			String s = br.readLine();
			int answer = 0;

			switch (s) {
			case "MON":
				answer = 6;
				break;
			case "TUE":
				answer = 5;
				break;
			case "WED":
				answer = 4;
				break;
			case "THU":
				answer = 3;
				break;
			case "FRI":
				answer = 2;
				break;
			case "SAT":
				answer = 1;
				break;
			case "SUN":
				answer = 7;
				break;
			}

			System.out.printf("#%d %d\n", test, answer);

		}

	}

}
