package basic100;
import java.util.Scanner;

public class Ex77 {

	public static void main(String[] args) {
		// 원하는 문자가 입력될 때까지 반복 출력하기
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
