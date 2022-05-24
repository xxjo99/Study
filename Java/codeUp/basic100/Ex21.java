package basic100;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// 정수 소수 분리
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		String []b = n.split("\\.");
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		sc.close();
		
	}

}
