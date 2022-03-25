package basic100;
import java.util.Scanner;

public class Ex74 {

	public static void main(String[] args) {
		// 문자 1개 입력받아 알파벳 출력하기
		Scanner sc = new Scanner(System.in);
        
        char a=sc.nextLine().charAt(0);
        
        for(char i='a';i<=a;i++) {
            System.out.print(i+" ");
        }
		
		
		sc.close();
	}

}
