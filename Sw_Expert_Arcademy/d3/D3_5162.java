package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_5162 {

	public static void main(String[] args) throws IOException {
		// µÎ°¡Áö »§ÀÇ µô·¹¸¶ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int min = Math.min(a, b);
			
			System.out.println("#" + test + " " + (c / min));
		}

	}

}
