package math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_1731 {

    public static void main(String[] args) throws IOException {
        // ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        int k = 1;
        
        while (n != 0) {
        	if (n < k) {
        		k = 1; 
        	}
        	
        	n -= k;
        	k++;
        	count++;
        }
        
        System.out.println(count);
    }
}
