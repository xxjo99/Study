package basic100;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// #18
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		String arr[] = n.split("-");
		
		String a = arr[0];
		String b = arr[1];
		
		System.out.println(a+b);
		
		sc.close();
	}

}
