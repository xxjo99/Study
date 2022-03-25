package basic100;
import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		// 정수 2개 입력받아 나눈 몫 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a/b);
		
		sc.close();
	}

}
