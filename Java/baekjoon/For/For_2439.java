package for_;

import java.util.Scanner;

public class For_2439 {

	public static void main(String[] args) {
		// 별찍기-2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}

}