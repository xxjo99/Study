package level1;

public class InsufficientCash {
	
    public static long solution(int price, int money, int count) {
        
        long need = 0;
        for (int i = 1; i <= count; i++) {
        	need += price * i;
        }
        
        long answer = need - money;
        
        if (answer <= 0) {
        	return 0;
        } else {
        	return answer;
        }
    }

	public static void main(String[] args) {
		// 부족한금액
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.println(solution(price, money, count));

	}

}
