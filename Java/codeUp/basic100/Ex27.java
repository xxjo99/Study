package basic100;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// float 범위보다 큰 정수 출력
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.printf("%.11f",a);
		
		sc.close();
	}

}
