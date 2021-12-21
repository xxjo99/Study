package while_;

import java.util.Scanner;

public class While_10952 {

	public static void main(String[] args) {
		/* A+B #1 */
		Scanner sc = new Scanner(System.in);
		boolean cheak = true;
		while(cheak) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0 && b== 0) {
				break;
			}
			sc.close();
			System.out.println(a+b);
		}
	}
	
}
