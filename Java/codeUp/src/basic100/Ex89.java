package basic100;
import java.util.Scanner;

public class Ex89 {

	public static void main(String[] args) {
		// �Բ� ���� Ǫ�� ��
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int day = 1;
        
        while (day%a != 0 || day%b != 0 || day%c != 0) {
        	day++;
        }
        
        System.out.println(day);
        	
        	
		sc.close();
	}

}
