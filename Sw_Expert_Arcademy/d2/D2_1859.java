package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1859 {

	public static void main(String[] args) throws IOException {
		// 백만 장자 프로젝트
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long sum = 0;
			int max = arr[n-1];
			
			for (int i = n-2; i >= 0; i--) {
				if (arr[i] > max) {
					max = arr[i];
				} else {
					sum += max - arr[i];
				}
			}
			
			System.out.println("#" + test + " " + sum);
			
		}
		
	}

}
