package basic100;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// 문자 분리
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		int n = a.length();
		
		for (int i = 0; i<n; i++) {
			System.out.println("'" + a.charAt(i) + "'");
		}
		sc.close();
	}

}
