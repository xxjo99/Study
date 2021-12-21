package num_combinatorics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NC_2609 {
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}

	public static void main(String[] args) throws IOException {
		// 최대공약수와 최소공배수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int c = gcd(a, b);
		
		int lcd = (a * b) / c;
		
		System.out.println(c);
		System.out.println(lcd);
		
		
	}

}
