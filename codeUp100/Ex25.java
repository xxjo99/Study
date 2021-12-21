package codeUp100;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// #25
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		for (int i = 0; i<5; i++) {
			System.out.print("[" + a.charAt(i));
			for (int j = 0; j< 4-i; j++) {
				System.out.print("0");
			}
			System.out.println("]");
		}
		sc.close();
	}

}
