package for_;

import java.util.Scanner;

public class For_11021 {

	public static void main(String[] args) {
		/* A+B #2 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
		sc.close();
	}

}