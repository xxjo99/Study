package math2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math2_1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 소수찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		String numArr[] = br.readLine().split(" ");
		int result = 0;
		
		for(int i = 0 ; i < T ; i++) {
			int num = Integer.parseInt(numArr[i]);
			int count = 0;
			if(num == 1) {
				continue;
			} else {
				for(int i2 = 1 ; i2 <= num ; i2++) {
					if(num % i2 == 0) {
						count++;
					}
				}
			}
			
			if(count == 2) {
				result++;
			}
		}
		
		bw.write(String.valueOf(result));

		br.close();
		bw.flush();
		bw.close();
	}
}