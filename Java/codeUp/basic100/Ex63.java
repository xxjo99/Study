package basic100;
import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		// ���� 3�� �Է¹޾� ���� ���� �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a<b?a:b)<c?(a<b?a:b):c);

		sc.close();
	}

}
