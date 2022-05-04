package level1;

public class AddDigit {
	
    public static int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
        	answer += n % 10;
        	n = n / 10;
        }

        return answer;
    }

	public static void main(String[] args) {
		// 자릿수 더하기
		int n = 123;
		System.out.println(solution(n));
		

	}

}
