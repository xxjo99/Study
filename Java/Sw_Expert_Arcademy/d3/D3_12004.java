package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_12004 {

	public static void main(String[] args) throws IOException {
		// ±¸±¸´Ü1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			String answer = "No";
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10; k++) {
					if (j*k == n) {
						answer = "Yes";
					}
				}
			}
			System.out.println("#" + i + " " + answer);
		}
	}

}
