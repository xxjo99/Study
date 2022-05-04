package Greedy;
import java.util.Scanner;

public class Greedy_5585 {

	public static void main(String[] args) {
		// �Ž�����
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ������ ��
		
		int change = 1000-n; // �Ž�����
		
		int[] money = {500, 100, 50, 10, 5, 1}; // �Ž����� ����
		
		int count = 0; // �Ž����� ����
		
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
