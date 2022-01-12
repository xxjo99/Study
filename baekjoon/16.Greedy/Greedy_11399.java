package Greedy;
import java.util.Scanner;
import java.util.Arrays;

public class Greedy_11399 {

	public static void main(String[] args) {
		// ATM
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // ����� ��
		
		int[] arr = new int[n]; // �ҿ� �ð�
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // �ð� �������� ����
		
		int a = 0; // ���ð� ���� ��
		int sum = 0; // ����� ���ð� ����
		
		for (int i = 0; i<n; i++) {
			sum += a + arr[i];
			a += arr[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
