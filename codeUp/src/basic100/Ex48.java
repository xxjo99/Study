package basic100;
import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���ϱ�1
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
