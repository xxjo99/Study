package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1961 {

	public static void main(String[] args) throws IOException {
		// 숫자 배열 회전
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 90도
			int[][] arr90 = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr90[i][j] = arr[n-j-1][i];
				}
			}
			
			// 180도
			int[][] arr180 = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr180[i][j] = arr[n-i-1][n-j-1];
				}
			}
			
			// 270도
			int[][] arr270 = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr270[i][j] = arr[j][n-i-1];
				}
			}
			
			System.out.println("#" + test);
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(arr90[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j < n; j++) {
					System.out.print(arr180[i][j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j < n; j++) {
					System.out.print(arr270[i][j]);
				}
				System.out.print(" ");
				
				System.out.println();
			}
			
		}
		
	}

}
