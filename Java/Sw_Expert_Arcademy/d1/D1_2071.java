package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D1_2071 {

	public static void main(String[] args) throws IOException {
		// 평균값 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t =Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 1; i <= t; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 10; j++) {
				int a = Integer.parseInt(st.nextToken());
				sum += a;
			}
			int avg = sum / 10;
			System.out.println("#" + i + " " + avg);
		}

	}

}
