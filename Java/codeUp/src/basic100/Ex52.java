package basic100;
import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		// 참 거짓 바꾸기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
