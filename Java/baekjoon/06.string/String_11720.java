package string;

import java.util.Scanner;

public class String_11720 {

	public static void main(String[] args) {
		// 숫자의 합
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String number = sc.next();
		int sum = 0;
		
		for (int i = 0; i<n; i++) {
			sum += number.charAt(i)-'0';
		}
		System.out.println(sum);
		sc.close();
	}

}
