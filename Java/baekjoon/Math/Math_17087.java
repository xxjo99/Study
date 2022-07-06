package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_17087 {
	
	static int GCD(int n1, int n2) {
		if(n2 ==0) {
			return n1;
		} else {
			return GCD(n2,n1%n2);
		}
	}

	public static void main(String[] args) throws IOException {
		// 숨바꼭질 6
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = Math.abs(s-a);
		}
		
		int gcd = arr[0];
		for(int i=1; i<arr.length; i++) {
			gcd = GCD(gcd,arr[i]);
		}
		System.out.println(gcd);
	}

}
