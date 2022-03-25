package basic100;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// 10진수 -> 16진수
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%x", a);
		
		sc.close();
	}

}
