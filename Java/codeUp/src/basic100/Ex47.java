package basic100;
import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		// 한 번에 2의 거듭제곱 배로 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d", a<<b);
		
		sc.close();
	}

}
