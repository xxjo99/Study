package algorithm;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// false일경우 소수
		boolean[] check = new boolean[b+1];
		
		check[0] = check[1] = true;
		for (int i = 2; i <= Math.sqrt(check.length); i++) {
			if (check[i] == true) {
				continue;
			}
			
			for(int j = i * i; j < check.length; j += i) {
				check[j] = true;
			}
		}
		
		for (int i = a; i <= b; i++) {
			if (check[i] == false) {
				System.out.println(i);
			}
		}
		

	}

}
