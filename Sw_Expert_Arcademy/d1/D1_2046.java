package d1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class D1_2046 {
 
    public static void main(String[] args) throws IOException {
        // ½ºÅÆÇÁ Âï±â
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            System.out.print("#");
        }
    }
 
}