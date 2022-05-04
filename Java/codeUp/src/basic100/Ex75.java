package basic100;
import java.util.Scanner;

public class Ex75 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 그 수까지 출력하기
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i= 0; i<=n; i++) {
            System.out.println(i);
        }
		
		
		sc.close();
	}

}
