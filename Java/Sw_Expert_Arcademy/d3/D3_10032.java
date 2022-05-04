package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_10032 {

	public static void main(String[] args) throws IOException {
		// 과자 분배
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			if(n % k == 0) {
				System.out.println("#" + test + " 0");
			} else {
				System.out.println("#" + test + " 1");
			}
			
		}
	}

}
