package basic100;
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// 영문자를 아스키코드 변환
		Scanner sc = new Scanner(System.in);
		
		char a = sc.nextLine().charAt(0);
		int b = (int)a;
		
		System.out.println(b);
		sc.close();
	}

}
