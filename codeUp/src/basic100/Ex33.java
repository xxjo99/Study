package basic100;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// 8���� -> 10����
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.valueOf(a,8);
		
		System.out.println(b);
		
		sc.close();
	}

}
