package basic100;
import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		// ���� 3�� �Է¹޾� ¦/Ȧ ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
				
		for (int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<3; i++) {
			if (arr[i]%2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		
		sc.close();
	}

}
