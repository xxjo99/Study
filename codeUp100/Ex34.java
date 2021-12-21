package codeUp100;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// #34
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.valueOf(a,8);
		System.out.println(b);
		sc.close();
	}

}
