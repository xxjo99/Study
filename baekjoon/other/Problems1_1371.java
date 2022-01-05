package problems1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problems1_1371 {

    public static void main(String[] args) throws IOException {
        // 가장 많은 글자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] alp = new int[26];
        String str;
        
        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alp[str.charAt(i) - 'a']++;
                }
            }
        }
        
        int max = -1;
        
        for (int i = 0; i < alp.length; i++) {
        	if (alp[i] > max) {
        		max = alp[i];
        	}
        }
        
        for (int i = 0; i < alp.length; i++) {
        	if (alp[i] == max) {
        		System.out.print((char)(i + 'a'));
        	}
        }
        
        
    }
}
