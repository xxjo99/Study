package Greedy;
import java.util.Scanner;

public class Greedy_10162 {

	public static void main(String[] args) {
		// ���ڷ�����
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // �丮�ð�
				
		int[] arr = {300, 60, 10}; // ��ư�� �ð�
		
		int[] count = new int[3]; //  a, b, c Ƚ�� ����
				
		if (t%10 != 0) {
			System.out.println("-1");
		} else {
			for (int i = 0; i < 3; i++) {
				if (t >= arr[i]) {
					count[i] = t / arr[i];
					t = t % arr[i];
				}
			}
			System.out.println(count[0] + " " + count[1] + " " + count[2]);
		}
		
		sc.close();
	}

}
