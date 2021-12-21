package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_9997 {

	public static void main(String[] args) throws IOException {
		// 미니멀리즘 시계
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			
			int hour = n / 30;
			int min = (n - (30 * hour)) * 2;
			
			if (n == 360) {
				hour = 0;
				min = 0;
			}
			
			System.out.println("#" + test + " " + hour + " " + min);
		}
	}

}
