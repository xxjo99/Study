package basic100;
import java.util.Scanner;

public class Ex81 {

	public static void main(String[] args) {
		// ºû ¼¯¾î »ö ¸¸µé±â
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        
        for (int i =  0; i < a; i++) {
        	for (int j = 0; j < b; j++) {
        		for (int k = 0; k < c; k++) {
        			System.out.println(i + " " + j + " " + k);
        			sum++;
        		}
        	}
        }
        
    	System.out.println(sum);
		
		sc.close();
	}

}
