package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class D3_8821 {

	public static void main(String[] args) throws IOException {
		// 적고 지우기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			String s = br.readLine();
			
			int[] arr = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i) - '0';
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (!list.contains(arr[i])) {
					list.add(arr[i]);
				} else {
					list.remove(Integer.valueOf(arr[i]));
				}
			}
			
			System.out.printf("#%d %d\n", test, list.size());
			
		}
	}

}
