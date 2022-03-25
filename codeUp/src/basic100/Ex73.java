package basic100;
import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 카운트다운 출력하기2
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (true) {
			System.out.println(n-1);
			n--;
			if (n==0) {
				break;
			}
		}
		
		
		sc.close();
	}

}
