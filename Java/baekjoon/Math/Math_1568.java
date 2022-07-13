package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_1568 {

	public static void main(String[] args) throws IOException {
		// �߷�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (arr[1] - arr[0] == arr[2] - arr[1]) {
			System.out.println(arr[n - 1] + (arr[1] - arr[0]));
		} else {
			System.out.println(arr[n - 1] * (arr[1] / arr[0]));
		}

	}
}
