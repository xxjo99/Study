package basic100;
import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		// ��/������ ���� ���� ������ �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a == b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
