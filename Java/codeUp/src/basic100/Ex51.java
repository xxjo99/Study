package basic100;
import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���ϱ�4
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a!=b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
