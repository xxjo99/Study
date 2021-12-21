package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class D1_2029 {
 
    public static void main(String[] args) throws IOException {
        // 몫과 나머지 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	System.out.println("#" + i + " " + a / b + " " + a % b);
        }
    }
 
}