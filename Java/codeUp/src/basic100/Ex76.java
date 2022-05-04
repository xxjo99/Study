package basic100;
import java.util.Scanner;

public class Ex76 {

	public static void main(String[] args) {
		// 짝수 합 구하기
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i= 0; i<=n; i++) {
        	if (i%2==0) {
        		sum += i;
        	}
        }
        
        System.out.println(sum);
		
		
		sc.close();
	}

}
