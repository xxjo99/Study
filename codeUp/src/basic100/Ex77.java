package basic100;
import java.util.Scanner;

public class Ex77 {

	public static void main(String[] args) {
		// ���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�
        Scanner sc=new Scanner(System.in);
        
        while(true) {
            char a=sc.next().charAt(0);
            
            if(a=='q') {
                System.out.println(a);
                break;
            }
           
            System.out.println(a); 
        }
		
		sc.close();
	}

}
