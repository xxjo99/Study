package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_1989 {

	public static void main(String[] args) throws IOException {
		// 초심자의 회문 검사
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			String k = br.readLine();
			String rev = "";
			
			for (int i = k.length()-1; i >= 0; i--) {
				rev = rev + k.charAt(i);
			}
			
			if (k.equals(rev)) {
				System.out.println("#" + test + " 1");
			} else {
				System.out.println("#" + test + " 0");
			}
			
		}
		
	}

}
