package basic100;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// 정수 2개 입력받아 자동 계산하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		float b = sc.nextFloat();
		
		int r1 = (int)(a+b); 
		int r2 = (int)(a-b);
		int r3 = (int)(a*b);
		int r4 = (int)(a/b);
		int r5 = (int)(a%b);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		float c = a / b;
		System.out.printf("%.2f", c);
		
		sc.close();
	}

}
