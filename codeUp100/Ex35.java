package codeUp100;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// #35
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = Integer.valueOf(s, 16);
		String b = Integer.toOctalString(a);
		System.out.println(b);
		sc.close();
	}

}
