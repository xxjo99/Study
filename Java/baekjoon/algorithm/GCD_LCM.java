package algorithm;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class GCD_LCM {
	
	// 최대공약수
	private static int GCD(int a, int b) {
		
		int gcd = a % b;
		
		if (gcd != 0) {
			return GCD(b, gcd);
		} else {
			return b;
		}
		
	}

	//최소공배수
	private static int LCM(int a, int b) {
		return (a*b) / GCD(a, b);
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(GCD(a, b));
		System.out.println(LCM(a, b));
	}

}
