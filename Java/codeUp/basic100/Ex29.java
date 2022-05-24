package basic100;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// 10진수 -> 8진수
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%o", a);
		
		sc.close();
	}

}
