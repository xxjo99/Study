package basic100;
import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 1 더해 출력하기
		Scanner sc = new Scanner(System.in);
		
		Long a = sc.nextLong();
		
		System.out.println(a+1);
		
		sc.close();
	}

}
