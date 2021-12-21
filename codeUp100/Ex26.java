package codeUp100;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// #26
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] arr = a.split(":");
		
		System.out.println(Integer.parseInt(arr[1]));
		
		sc.close();
	}

}
