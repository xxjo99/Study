package basic100;
import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// 16진수 -> 8진수
		Scanner sc = new Scanner(System.in);
		
		String six = sc.nextLine();
		int a = Integer.valueOf(six, 16);
		
		String b = Integer.toOctalString(a);
		System.out.println(b);
		sc.close();
	}

}
