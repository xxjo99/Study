 package d3;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_10804 {

	public static void main(String[] args) throws IOException {
		// 문자열의 거울상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			String s = br.readLine();
			StringBuffer sb = new StringBuffer(s);
			String str = sb.reverse().toString();
			String result = "";
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (c == 'b') {
					result += 'd';
				} else if (c == 'd') {
					result += 'b';
				} else if (c == 'p') {
					result += 'q';
				} else {
					result += 'p';
				}
			
			}
			
			System.out.println("#" + test + " " + result);
			
		}
	}

}
