package basic100;
import java.util.Scanner;

public class Ex66 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 평가 출력하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (90 <= a && a <= 100) {
			System.out.println("A");
		} else if (70 <= a && a <= 89) {
			System.out.println("B");
		} else if (40 <= a && a <= 69) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		sc.close();
	}

}
