package if_;

import java.util.Scanner; 

public class If_9498 {

	public static void main(String[] args) {
		/* ���輺�� ��� */
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (90 <= score) {
			System.out.println("A");
		} else if (90>score && 80 <= score) {
			System.out.println("B");
		} else if (80>score && 70 <= score) {
			System.out.println("C");
		} else if (70>score && 60 <= score) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		sc.close();
	} 
	
}