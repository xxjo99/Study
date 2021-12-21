package Greedy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_1541 {

	public static void main(String[] args) throws IOException {
		// ÀÒ¾î¹ö¸° °ýÈ£
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
		int sum = Integer.MAX_VALUE;
		
		while (sub.hasMoreTokens()) {
			int temp = 0;
			
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
			
			while (add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
			
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		
		bw.write(sum + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
