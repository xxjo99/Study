package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_1945 {

	public static void main(String[] args) throws IOException {
		// 간단한 소인수분해
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[] arr = {2, 3, 5, 7, 11};
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.print("#" + test + " ");
			for (int i = 0; i < 5; i++) {
				int count = 0;
				while (n % arr[i] == 0) {
					n /= arr[i];
					count++;
				}
				System.out.print(count + " ");
			}
			System.out.println();
			
		}
		
	}

}
