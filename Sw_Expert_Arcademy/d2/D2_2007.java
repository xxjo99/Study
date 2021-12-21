package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class D2_2007 {
 
    public static void main(String[] args) throws IOException {
        // 패턴 마디의 길이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int t = Integer.parseInt(br.readLine());
         
        for (int i = 1; i <= t; i++) {
            String a = br.readLine();
            for (int j = 1; j <= a.length(); j++) {
                if (a.substring(0, j).equals(a.substring(j, j * 2))) {
                    System.out.println("#" + i + " " + j);
                    break;
                }
            }
        }
         
    }
 
}
