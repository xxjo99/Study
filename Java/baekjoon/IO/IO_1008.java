package io;

import java.util.Scanner;

public class IO_1008 {

	public static void main(String[] args) {
		// A/B
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
		sc.close();
	}

}