package basic100;
import java.util.Scanner;

public class Ex88 {

	public static void main(String[] args) {
		// 수 나열하기3
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long res = a * m + d;
 
        if (n == 1)
            System.out.println(a);
 
        else {
            for (int i = 2; i < n; i++) {
                res = res * m + d;
            }
            System.out.println(res);
        }
        
		sc.close();
	}

}
