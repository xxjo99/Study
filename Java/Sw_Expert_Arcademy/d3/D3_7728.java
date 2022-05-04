package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class D3_7728 {

	public static void main(String[] args) throws IOException {
		// 다양성 측정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			String n = br.readLine();
			HashSet<Integer> set = new HashSet<>();

			for (int i = 0; i < n.length(); i++) {
				char c = n.charAt(i);
				set.add(Character.getNumericValue(c));
			}

			System.out.println("#" + test + " " + set.size());
		}
	}

}
