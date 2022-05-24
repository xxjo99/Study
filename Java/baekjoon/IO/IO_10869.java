package io;

import java.util.Scanner;

public class IO_10869 {

	public static void main(String[] args) {
		// 사칙연산
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		sc.close();
	}

}
