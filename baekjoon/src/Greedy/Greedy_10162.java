package Greedy;
import java.util.Scanner;

public class Greedy_10162 {

	public static void main(String[] args) {
		// 전자레인지
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 요리시간
				
		int[] arr = {300, 60, 10}; // 버튼의 시간
		
		int[] count = new int[3]; //  a, b, c 횟수 저장
				
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
