package basic100;
import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		// ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�2
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (true) {
			System.out.println(n-1);
			n--;
			if (n==0) {
				break;
			}
		}
		
		
		sc.close();
	}

}
