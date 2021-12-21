 package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class D3_10505 {

	public static void main(String[] args) throws IOException {
		// ¼Òµæ ºÒ±ÕÇü
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			double sum = 0.0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			double avr = sum / n;
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] <= avr) {
					count++;
				}
			}
			
			System.out.println("#" + test + " " + count);
		}
	}

}
