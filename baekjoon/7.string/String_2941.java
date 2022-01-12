package string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_2941 {

	public static void main(String[] args) throws IOException {
		// 크로아티아 알파벳
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < arr.length; i++) {
			if(t.contains(arr[i])) {
				t = t.replace(arr[i], "!");
			}
		}
		System.out.println(t.length());
			
	}

}
