package math1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_1193 {

	public static void main(String[] args) throws IOException {
		// 분수찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		int n = 0;
		
		while (true) {
			n++;
			count += n;
			if (count >= a) {
				if(n % 2 == 0) {
					System.out.println(a - count + n + "/" + (count - a + 1));
				} else {
					System.out.println((count - a + 1) + "/" + (a - count + n));
				}
				break;
			}
		}
	}

}
