package string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_1316 {

	public static void main(String[] args) throws IOException {
		// 그룹 단어 체커
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = n;
		
		for (int t = 0; t < n; t++) {
			String str = br.readLine();
			boolean[] bol = new boolean[26];
			
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i-1) != str.charAt(i)) {
					 if(bol[str.charAt(i) - 97] == true) {
						 count--;
						 break;
					 }
					 bol[str.charAt(i-1) - 97] = true;
				}
			}
		}
		System.out.println(count);
	}
}