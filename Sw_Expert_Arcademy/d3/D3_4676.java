package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class D3_4676 {

	public static void main(String[] args) throws IOException {
		// 늘어지는 소리 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			String s = br.readLine();
			StringBuffer sb = new StringBuffer(s);

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);

			for (int i = 0; i < n; i++) {
				sb.insert(arr[i] + i, "-");
			}

			System.out.println("#" + test + " " + sb.toString());
		}
		
	}

}
