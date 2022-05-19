package setAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SM_11478 {

	public static void main(String[] args) throws IOException {
		// 서로 다른 부분 문자열의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			String a = "";
			
			for (int j = i; j < s.length(); j++) {
				a += s.substring(j, j+1);
				set.add(a);
			}
			
		}
		
		System.out.println(set.size());
		
	}
}