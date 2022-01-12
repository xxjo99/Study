package if_;

import java.util.Scanner;

public class If_2884 {

	public static void main(String[] args) {
		/* 알람시계 */
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M>=45) {
			System.out.println(H + " " + (M-45));
		} else {
			if (H==0) {
				System.out.println(23 + " " + (60+(M-45)));
			} else {
				System.out.println(H-1 + " " + (60+(M-45)));
			}
		}
		sc.close();
	}
	
}
