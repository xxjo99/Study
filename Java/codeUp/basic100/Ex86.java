package basic100;
import java.util.Scanner;

public class Ex86 {

	public static void main(String[] args) {
		// �� �����ϱ�1
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        	
        System.out.println(d*(n-1) + a);
        
		sc.close();
	}

}
