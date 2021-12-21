package codeUp100;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// #23
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		String []b = n.split("\\.");
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		sc.close();
	}

}
