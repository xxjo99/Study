package basic100;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// 분만 출력
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] arr = a.split(":");
		
		System.out.println(Integer.parseInt(arr[1]));
		
		sc.close();
	}

}
