package basic100;
import java.util.Scanner;

public class Ex74 {

	public static void main(String[] args) {
		// ���� 1�� �Է¹޾� ���ĺ� ����ϱ�
		Scanner sc = new Scanner(System.in);
        
        char a=sc.nextLine().charAt(0);
        
        for(char i='a';i<=a;i++) {
            System.out.print(i+" ");
        }
		
		
		sc.close();
	}

}
