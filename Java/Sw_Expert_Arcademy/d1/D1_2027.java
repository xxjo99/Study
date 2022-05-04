package d1;
 
public class D1_2027 {
 
    public static void main(String[] args) {
        // 대각선 출력하기
    	
    	for (int i = 0; i < 5; i++) {
    		for (int j = 0; j < 5; j++) {
    			if (i == j) {
    				System.out.print("#");
    			} else {
    				System.out.print("+");
    			}
    		}
    		System.out.println();
    	}
    }
 
}