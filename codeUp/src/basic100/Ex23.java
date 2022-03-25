package basic100;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// 숫자 분리
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		for (int i = 0; i<5; i++) {
			System.out.print("[" + a.charAt(i));
			for (int j = 0; j< 4-i; j++) {
				System.out.print("0");
			}
			System.out.println("]");
		}
		sc.close();
	}

}
