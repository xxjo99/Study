package basic100;
import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		// 두 정수 입력받아 큰 수 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a>b ? a : b);

		sc.close();
	}

}
