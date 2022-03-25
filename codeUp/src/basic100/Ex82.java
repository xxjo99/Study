package basic100;
import java.util.Scanner;

public class Ex82 {

	public static void main(String[] args) {
		// 소리 파일 저장용량 계산하기
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
