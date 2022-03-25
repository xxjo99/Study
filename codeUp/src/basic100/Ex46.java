package basic100;
import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 2배 곱해 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.printf("%d", a<<1);
		
		sc.close();
	}

}
