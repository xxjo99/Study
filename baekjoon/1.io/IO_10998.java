package io;

import java.util.Scanner;

public class IO_10998 {

	public static void main(String[] args) {
		/* 입력받은 숫자를 이용해 곱셈 계산 */
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
		sc.close();
	}

}
