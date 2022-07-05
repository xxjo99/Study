package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class String_11656 {

	public static void main(String[] args) throws IOException {
		// 접미사 배열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String[] arr = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			String a = s.substring(i, s.length());
			arr[i] = a;
		}
		Arrays.sort(arr);
		
		for (String i : arr) {
			System.out.println(i);
		}
		

	}

}
