package basic100;
import java.util.Scanner;

public class Ex82 {

	public static void main(String[] args) {
		// �Ҹ� ���� ����뷮 ����ϱ�
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        
        float result = (float) (h*b*c*s) / 8 / 1024 / 1024;
        
        System.out.format("%.1f MB" , result);
        
		sc.close();
	}

}
