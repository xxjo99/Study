package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Sort_18870 {

	public static void main(String[] args) throws IOException {
		// ÁÂÇ¥ ¾ÐÃà
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sortarr = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = sortarr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sortarr);
		
		int a = 0;
		for (int i : sortarr) {
			if (!map.containsKey(i)) {
				map.put(i, a);
				a++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			int k = map.get(i);
			sb.append(k).append(' ');
		}
		
		System.out.println(sb);

	}

}
