package d3;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class D3_6692 {

	public static void main(String[] args) throws IOException {
		// 다솔이의 월급상자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());

			double[] arr1 = new double[n];
			int[] arr2 = new int[n];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				arr1[i] = Double.parseDouble(st.nextToken());
				arr2[i] = Integer.parseInt(st.nextToken());
			}

			double average = 0;
			for (int i = 0; i < n; i++) {

				average += arr1[i] * arr2[i];

			}

			System.out.println("#" + tc + " " + average);
		}

	}

}
