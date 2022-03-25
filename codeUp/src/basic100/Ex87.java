package basic100;
import java.util.Scanner;

public class Ex87 {

	public static void main(String[] args) {
		// 수 나열하기2
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(a*(long)(Math.pow(r, n-1)));
        
		sc.close();
	}

}
