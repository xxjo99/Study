package while_;

import java.util.Scanner;

public class While_1110 {

	public static void main(String[] args) {
		/* 더하기 사이클 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = n;
		int count = 0;
		do {
			number = ((number%10*10) + ((number/10+number%10)%10));
			count++;
			} while(number != n);
		System.out.println(count);
		sc.close();
		} 
	
	}
