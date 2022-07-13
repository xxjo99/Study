package math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_1834 {

    public static void main(String[] args) throws IOException {
        // �������� ���� ���� ��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Integer.parseInt(br.readLine());
        long sum = 0;
        
        for (long i = 1; i < n; i++) {
        	sum += (n + 1) * i;
        }
        
        System.out.println(sum);
    }
}
