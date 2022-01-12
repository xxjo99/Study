package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math2_1002 {

	public static void main(String[] args) throws IOException {
		// 터렛
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int test = 0; test < t; test++) {
			int[] arr = new int[6];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int a = (int) (Math.pow(arr[3] - arr[0], 2) + Math.pow(arr[4] - arr[1], 2));

			// 두 원의 중심이 같고, 반지름도 같을 때 ( 접점의 개수가 무한할 때 )
			if (arr[0] == arr[3] && arr[1] == arr[4] && arr[2] == arr[5]) {
				System.out.println(-1);
			} else if (a > Math.pow(arr[5] + arr[2], 2)) { // 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때 (접점이 없을 때)
				System.out.println(0);
			} else if (a < Math.pow(arr[5] - arr[2], 2)) { // 원 안에 원이 있으나 내접하지 않을 때 (접점이 없을 때)
				System.out.println(0);
			} else if (a == Math.pow(arr[5] - arr[2], 2)) { // 내접
				System.out.println(1);
			} else if (a == Math.pow(arr[5] + arr[2], 2)) { // 외접
				System.out.println(1);
			} else { // 접접 2개
				System.out.println(2);
			}

		}

	}

}
