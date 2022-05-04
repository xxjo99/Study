package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class D3_3499 {

	public static void main(String[] args) throws IOException {
		// ∆€∆Â∆Æ º≈«√
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<String> list = new ArrayList<>();
			ArrayList<String> answer = new ArrayList<>();

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				list.add(st.nextToken());
			}

			int remain = n % 2;
			for (int i = 0; i < n / 2; i++) {
				answer.add(list.get(i));
				answer.add(list.get(i + (n / 2) + remain));
			}
			
			if (remain != 0) {
				answer.add(list.get(n/2));
			}
			
			System.out.print("#" + test + " ");
			for (int i = 0; i < n; i++) {
				System.out.print(answer.get(i) + " ");
			}
			System.out.println();

		}
	}

}
