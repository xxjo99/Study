package for_;

import java.util.Scanner;

public class For_10950 {

	public static void main(String[] args) {
		/* A+B */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
	}

}
