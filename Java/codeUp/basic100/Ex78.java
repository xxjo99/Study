package basic100;
import java.util.Scanner;

public class Ex78 {

	public static void main(String[] args) {
		// �������� ���ؾ� �ұ�?
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
    	int i = 1;
        
        while (true) {
        	sum += i;
        	if (sum >= n) {
        		System.out.println(i);
        		break;
        	}
        	i++;
        }		
		
		sc.close();
	}

}
