package while_;

import java.util.Scanner;

public class While_10951 {

	public static void main(String[] args) {
		/* A+B #2 */
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			sc.close();
		}
	}
	
}
