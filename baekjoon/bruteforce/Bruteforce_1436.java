package bruteforce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bruteforce_1436 {

	public static void main(String[] args) throws IOException {
		// ¿µÈ­°¨µ¶ ¼ò
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		int num = 666;
		
		while (count != n) {
			num++;
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
		
	}

}
