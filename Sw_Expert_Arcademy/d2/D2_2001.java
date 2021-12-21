package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_2001 {

	public static void main(String[] args) throws IOException {
		// 파리 퇴치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {			
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st1.nextToken());
			int m = Integer.parseInt(st1.nextToken()); // 파리채 크기 m x m
			
			// 파리 배열 생성
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st2.nextToken());
				}
			}
			
			int max = 0;
			int sum = 0;
			for (int i = 0; i < n-m+1; i++) {
				for (int j = 0; j < n-m+1; j++) {
					sum = 0;
					for (int k = 0; k < m; k++) {
						for (int l = 0; l < m; l++) {
							sum += arr[i+k][j+l];
						}
					}
					if (sum > max) {
						max = sum;
					}
				}
			}
			
			System.out.println("#" + test + " " + max);
			
		}
		
	}

}
