package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1285 {

	public static void main(String[] args) throws IOException {
		// 아름이의 돌 던지기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int[] dir = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				
				if (arr[i] == 0) {
					dir[i] = 0;
				} else if (arr[i] > 0) {
					dir[i] = arr[i];
				} else {
					dir[i] = 0 - arr[i];
				}
				
			}
			
			int min = 100001;
			int count = 0;
			for (int i : dir) {
				if (i < min) {
					min = i;
					count = 1;
				} else if (i == min){
					count++;
				}
			}
			
			System.out.println("#" + test + " " + min + " " + count);

		}

	}

}
