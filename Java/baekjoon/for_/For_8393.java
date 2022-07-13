package for_;

import java.util.Scanner;

public class For_8393 {

	public static void main(String[] args) {
		/* 합 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			sum += i; 
		} 
		sc.close();
		System.out.println(sum);
	}
	
}