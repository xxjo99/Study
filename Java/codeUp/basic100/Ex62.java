package basic100;
import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ū �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a>b ? a : b);

		sc.close();
	}

}
