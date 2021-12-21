package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D1_2070 {

	public static void main(String[] args) throws IOException {
		// Å« ³ð, ÀÛÀº ³ð, °°Àº ³ð
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t =Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a > b) {
				System.out.println("#" + i + " " + ">");
			} else if (a < b) {
				System.out.println("#" + i + " " + "<");
			} else {
				System.out.println("#" + i + " " + "=");
			}
		}

	}

}
