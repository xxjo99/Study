package basic100;
import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		// 비트단위로 XOR 하여 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a^b);

		sc.close();
	}

}
