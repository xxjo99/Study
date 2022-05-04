package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_12221 {

	public static void main(String[] args) throws IOException {
		// ±¸±¸´Ü2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (a > 9 || b > 9) {
				System.out.println("#" + i + " " + "-1");
			} else {
				System.out.println("#" + i + " " + a * b);
			}
		}

	}

}
