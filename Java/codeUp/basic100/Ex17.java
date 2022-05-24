package basic100;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// #17
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] arr = a.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);
		
		sc.close();
	}

}
