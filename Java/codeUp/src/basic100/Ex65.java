package basic100;
import java.util.Scanner;

public class Ex65 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 분석하기
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}
		
		if (a%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		sc.close();
	}

}
