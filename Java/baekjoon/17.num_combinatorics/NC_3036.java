package num_combinatorics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NC_3036 {

	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) throws IOException {
		// ¸µ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i < arr.length; i++) {
			int a = gcd(arr[0], arr[i]);
			System.out.println((arr[0] / a) + "/" + arr[i] / a);
		}

	}

}