package num_combinatorics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class NC_2981 {
	
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		// °Ë¹®
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int gcdVal = arr[1] - arr[0];
		for(int i = 2; i < n; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
		
		for(int i = 2; i <= gcdVal; i++) {
		    
			if(gcdVal % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
	}

}