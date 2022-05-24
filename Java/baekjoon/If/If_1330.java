package if_;

import java.util.Scanner;

public class If_1330 {

	public static void main(String[] args) {
		/* 두수 비교하기 */
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		sc.close();
	}

}
