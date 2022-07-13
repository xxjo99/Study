package for_;

import java.util.Scanner;

public class For_2739 {

	public static void main(String[] args) {
		// 구구단
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		sc.close();
	}

}
