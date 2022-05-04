package level2;

public class Numbercountry {
	
    public static String solution(int n) {
        String answer = "";
        String[] numbers = {"4", "1", "2"};
        
        int num = n;
        while (num > 0) {
        	int a = num % 3;
        	num /= 3;
        	
        	if (a == 0) {
        		num--;
        	}
        	
        	answer = numbers[a] + answer;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 124 나라의 숫자
		int n = 1;
		System.out.println(solution(n));
	}

}
