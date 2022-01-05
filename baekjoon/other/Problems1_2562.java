package problems1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problems1_2562 {

    public static void main(String[] args) throws IOException {
        // �ֻ��� �װ�
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int max = -1;
        int maxi = 0;
        int maxj = 0;
        
        for (int i = 1; i <= 9; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	for (int j = 1; j <= 9; j++) {
        		int n = Integer.parseInt(st.nextToken());
        		if (n > max) {
        			max = n;
        			maxi = i;
        			maxj = j;
        		}
        	}
        }
        
        System.out.println(max);
        System.out.println(maxi + " " + maxj);
        
        
        
    }
}
