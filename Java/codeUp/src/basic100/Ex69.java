package basic100;
import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {
		// 0 �Էµ� ������ ���� ����ϱ�1
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			
			if (a==0) {
				break;
			}
			
			System.out.println(a);
		}
		
		
		sc.close();
	}

}
