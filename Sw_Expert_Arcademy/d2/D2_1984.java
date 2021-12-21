package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1984 {

	public static void main(String[] args) throws IOException {
		// 중간 평균값 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int min = 10001;
			int max = -1;
			double sum = 0.0;
			int[] arr = new int[10];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
				
				if (arr[i] > max) {
					max = arr[i];
				}
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			
			sum -= max + min;
			sum /= 8;
			
			String a = String.format("%.0f", sum);
			
			System.out.println("#" + test + " " + a);
		}
		
	}

}
