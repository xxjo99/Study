package one_dimensional_array;

import java.util.Scanner;

public class ODA_8958 {

	public static void main(String[] args) {
		// OXÄûÁî
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	
		for (int i=0; i<a; i++) {
			int count = 1;
			int sum = 0;
			String b = sc.next();
			for (int j = 0; j < b.length(); j++) {
				if (b.charAt(j) == 'O') {
					sum += count;
					count++;
				} else {
					count = 1;										
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
