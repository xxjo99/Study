package basic100;
import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		// 문자 1개 입력받아 다음 문자 출력하기
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int num = (int)ch;
		char result = (char)(num+1);
		System.out.println(result);
		
		sc.close();
	}

}
