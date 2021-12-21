package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class D1_2043 {
 
    public static void main(String[] args) throws IOException {
        // 서랍의 비밀번호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int p = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 1;
        
        for (int i = k; i < p; i++) {
        	count++;
        }
        
        System.out.println(count);
    }
 
}