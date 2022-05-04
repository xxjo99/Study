package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Base64;

public class D2_1928 {

	public static void main(String[] args) throws IOException {
		// Base64 Decoder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			String encode = br.readLine();
			String decode = new String(Base64.getDecoder().decode(encode));
			System.out.printf("#%d %s\n", test, decode);

		}

	}

}
