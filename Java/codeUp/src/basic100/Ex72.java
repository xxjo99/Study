package basic100;
import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		// ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�1
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (true) {
			System.out.println(n);
			n--;
			if (n==0) {
				break;
			}
		}
		
		
		sc.close();
	}

}
