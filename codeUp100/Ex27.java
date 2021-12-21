package codeUp100;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// #27
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] arr = a.split("\\.");
		
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
		
		sc.close();
	}

}
