package codeUp100;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		// #46
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long r1 = a + b + c; 
		float r2 = (float)r1/3;
		System.out.println(r1);
		System.out.printf("%.1f", r2);
		sc.close();
	}

}
