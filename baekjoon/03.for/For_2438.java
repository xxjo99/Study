package for_;

import java.util.Scanner;

public class For_2438 {

	public static void main(String[] args) {
		/* º°Âï±â #1 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++ ) {
			for (int j=1; j <= i; j++) {
				System.out.print("*");
			} System.out.println("");
		}
		sc.close();
	}
	
}