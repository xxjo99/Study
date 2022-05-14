package string;

import java.util.Scanner;

public class String_2675 {

	public static void main(String[] args) {
		// 문자열 반복
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			String a = "";
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					a += s.charAt(j);
				}
			}
			System.out.println(a);
		}
		sc.close();
	}
}