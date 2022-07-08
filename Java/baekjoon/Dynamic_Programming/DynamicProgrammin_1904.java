package Dynamic_Programming1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgrammin_1904 {

	static int[] arr = new int[1000001];

	static int tile(int n) {
		if (arr[n] == -1) {
			arr[n] = (tile(n - 1) + tile(n - 2)) % 15746;
		}
		return arr[n];
	}

	public static void main(String[] args) throws IOException {
		// 01타일
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		for (int i = 3; i < arr.length; i++) {
			arr[i] = -1;
		}

		System.out.println(tile(n));
	}

}
