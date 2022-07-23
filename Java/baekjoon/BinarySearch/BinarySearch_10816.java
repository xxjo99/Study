package binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BinarySearch_10816 {

	private static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;

		while (lo < hi) {

			int mid = (lo + hi) / 2;

			if (key <= arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}

		return lo;
	}

	private static int upperBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;

		while (lo < hi) {

			int mid = (lo + hi) / 2;

			if (key < arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}

		return lo;
	}

	public static void main(String[] args) throws IOException {
		// 숫자카드2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());

			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);

	}

}
