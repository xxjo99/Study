package basic100;
import java.util.Scanner;

public class Ex80 {

	public static void main(String[] args) {
		// 3 6 9 게임의 왕이 되자!
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i<=n; i++) {
        	if (i == 3 || i == 6 || i == 9) {
        		System.out.print("X ");
        	} else {
            	System.out.print(i + " ");
        	}
        }
		
		sc.close();
	}

}
