package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_1970 {

	public static void main(String[] args) throws IOException {
		// 쉬운 거스름돈
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};  
		
		for (int test = 1; test <= t; test++) {
			int[] arr = new int[8];
			int n = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < money.length; i++) {
				arr[i] = n / money[i];
				n = n % money[i];
			}
			
			System.out.println("#" + test);
			for (int val : arr) {
				System.out.print(val + " ");				
			}
			System.out.println();
			 
		}
		
	}

}
