package basic100;
import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		// 비트단위로 NOT 하여 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(~a);

		sc.close();
	}

}
