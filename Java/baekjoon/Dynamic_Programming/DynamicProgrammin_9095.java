package dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_9095 {

	public static void main(String[] args) throws IOException {
		// 1, 2, 3 더하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for (int j = 4; j <= n; j++) {
				arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
			}
			System.out.println(arr[n]);
		}

	}
}
