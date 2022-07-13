package string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_1264 {

    public static void main(String[] args) throws IOException {
        // ������ ����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
        	String s = br.readLine();
        	if (s.equals("#")) {
        		break;
        	}
        	
        	int count = 0;
        	
        	for (int i = 0; i < s.length(); i++) {
        		if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        			count++;
        		}
        	}
        	
        	System.out.println(count);
        }
        
        
    }
}
