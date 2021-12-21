package io;

import java.util.Scanner;

public class IO_10430 {

	public static void main(String[] args) {
		/* 연산 입출력 */
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		sc.close();
	}

}
