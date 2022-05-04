package basic100;
import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// 정수를 아스키코드로 변환
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char b = (char)a;
		
		System.out.println(b);
		sc.close();
	}

}
