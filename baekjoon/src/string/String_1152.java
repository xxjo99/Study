package string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_1152 {

	public static void main(String[] args) throws IOException {
		// 단어의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		String a = br.readLine().toUpperCase();
		
		int max = -1;
		char st = '?';
		
		for(int i=0;i<a.length();i++) {
			arr[a.charAt(i)-65]++;
			if(max<arr[a.charAt(i)-65]) {
				max = arr[a.charAt(i)-65];
				st = a.charAt(i);
			}
			else if(max==arr[a.charAt(i)-65]) st = '?';
		}
		System.out.println(st);
		

	}

}
