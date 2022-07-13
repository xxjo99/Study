package for_;

import java.util.Scanner;

public class For_2742 {

	public static void main(String[] args) {
		/* 기찍N */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		sc.close();
	}

}