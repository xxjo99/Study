package codeUp100;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// #43
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a % b;
		System.out.println(result);
		sc.close();
	}

}
