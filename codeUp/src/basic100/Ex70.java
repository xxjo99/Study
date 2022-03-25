package basic100;
import java.util.Scanner;

public class Ex70 {

	public static void main(String[] args) {
		// 정수 입력받아 계속 출력하기
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			System.out.println(a);
		}
		
		
		sc.close();
	}

}
