package Greedy;
import java.util.Scanner;

public class Greedy_5585 {

	public static void main(String[] args) {
		// °Å½º¸§µ·
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ÁöºÒÇÒ µ·
		
		int change = 1000-n; // °Å½º¸§µ·
		
		int[] money = {500, 100, 50, 10, 5, 1}; // °Å½º¸§µ· Á¾·ù
		
		int count = 0; // °Å½º¸§µ· °³¼ö
		
		for (int i = 0; i<money.length; i++) {
			if (money[i] <= change) {
				count += change / money[i];
				change = change % money[i];
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
