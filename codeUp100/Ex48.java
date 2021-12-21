package codeUp100;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		// #48
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d", a<<b);
		sc.close();
	}

}
