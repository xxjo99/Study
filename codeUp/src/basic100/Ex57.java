package basic100;
import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		// 둘 다 거짓일 경우만 참 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a== 0&& b==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
