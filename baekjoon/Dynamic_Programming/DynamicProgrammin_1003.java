package Dynamic_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_1003 {

	public static void main(String[] args) throws IOException {
		// 피보나치 함수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] zero = new int[41];
		int[] one = new int[41];
		
		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;
		
		for (int i = 2; i < 41; i++) {
			zero[i] = zero[i - 1] + zero[i - 2];
			one[i] = one[i - 1] + one[i - 2];
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(zero[arr[i]] + " " + one[arr[i]]);
		}

	}

}
