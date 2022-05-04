package level1;

public class Ternary {
	
    public static int solution(int n) {
        int answer = 0;
        
        String s = "";
        while (n > 0) {
        	s = s + (n % 3);
        	n /= 3;
        }
        
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
        	char a = s.charAt(i);
        	int b = a - '0';
        	int c = (int) (b * Math.pow(3, j));
        	answer += c;
        	j++;
        }
         
        
        return answer;
    }

	public static void main(String[] args) {
		// 3진법 뒤집기
		int n = 125;
		System.out.println(solution(n));


	}

}
