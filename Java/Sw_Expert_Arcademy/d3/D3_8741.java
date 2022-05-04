package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_8741 {

	public static void main(String[] args) throws IOException {
		// 두문자어
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int test = 1; test <= t; test++) {
			String s = br.readLine();
			String[] arr = s.split(" ");
			String[] result = new String[arr.length];
			
			for (int i = 0; i < arr.length; i++) {
				String[] array = arr[i].split("");
				result[i] = array[0].toUpperCase(); 
			}
			
			System.out.print("#" + test + " ");
			for (String i : result) {
				System.out.print(i);
			}
			System.out.println();
			
		}
	}

}
