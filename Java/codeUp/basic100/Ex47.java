package basic100;
import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		// �� ���� 2�� �ŵ����� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d", a<<b);
		
		sc.close();
	}

}
