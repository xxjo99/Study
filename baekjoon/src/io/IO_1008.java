package io;

import java.util.Scanner;

public class IO_1008 {

	public static void main(String[] args) {
		/* 입력받은 숫자를 이용해 나눗셈 계산 */
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
		sc.close();
	}

}