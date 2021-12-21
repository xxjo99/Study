package Greedy;
import java.util.Scanner;
import java.util.Arrays;

public class Greedy_11399 {

	public static void main(String[] args) {
		// ATM
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 사람의 수
		
		int[] arr = new int[n]; // 소요 시간
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 시간 오름차순 정렬
		
		int a = 0; // 대기시간 누적 합
		int sum = 0; // 사람별 대기시간 총합
		
		for (int i = 0; i<n; i++) {
			sum += a + arr[i];
			a += arr[i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
