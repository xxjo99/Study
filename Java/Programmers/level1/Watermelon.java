package level1;

public class Watermelon {
	
    public static String solution(int n) {
        String answer = "";
        
        String watermelon = "수박";
        
        if (n % 2 == 0) {
        	answer = watermelon.repeat(n/2);
        } else {
        	answer = watermelon.repeat(n/2);
        	answer += "수";
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int n = 4;
		System.out.println(solution(n));

	}

}
