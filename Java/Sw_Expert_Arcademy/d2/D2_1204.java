package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1204 {

	public static void main(String[] args) throws IOException {
		// [S/W 문제해결 기본] 1일차 - 최빈수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int[] num = new int[101];
			int max = 0;
			int result = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 1000; i++) {
				num[Integer.parseInt(st.nextToken())]++;
			}
			
			for (int i = 0; i < 101; i++) {
				if (max < num[i]) {
					max = num[i];
					result = i;
				}
			}
			
			System.out.println("#" + test + " " + result);
			
		}
		
	}

}
