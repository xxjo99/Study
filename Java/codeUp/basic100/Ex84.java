package basic100;
import java.util.Scanner;

public class Ex84 {

	public static void main(String[] args) {
		// �������! ���� �׸�~
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; ; i++) {
            sum += i;
 
            if (sum >= n) {
                System.out.println(sum);
                break;
            }
        }
        
		sc.close();
	}

}
