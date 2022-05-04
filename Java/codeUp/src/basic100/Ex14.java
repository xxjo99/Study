package basic100;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// #14
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		
		System.out.println(String.format("%.2f", a));
		
		sc.close();
	}

}
