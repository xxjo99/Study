package d3;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class D3_5549 {

	public static void main(String[] args) throws IOException {
		// Ȧ���ϱ� ¦���ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			String n = br.readLine();
			
			char c = n.charAt(n.length()-1);
			int a = Character.getNumericValue(c);
			
			if (a % 2 == 0) {
				System.out.println("#" + tc + " " + "Even");
			} else {
				System.out.println("#" + tc + " " + "Odd");
			}
			
		}

	}

}
