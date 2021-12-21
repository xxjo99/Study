package function;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Function_1065 {
	
	static int han(int n) {		
		int count = 0;
		
		if (n < 100) {
			return n;
		} else {
			count = 99;
			
			if (n == 1000) {
				n = 999;
			}
			
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) throws IOException {
		// ÇÑ¼ö
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(han(Integer.parseInt(br.readLine())));
	}
	

}
