package level1;

public class Watermelon {
	
    public static String solution(int n) {
        String answer = "";
        
        String watermelon = "����";
        
        if (n % 2 == 0) {
        	answer = watermelon.repeat(n/2);
        } else {
        	answer = watermelon.repeat(n/2);
        	answer += "��";
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int n = 4;
		System.out.println(solution(n));

	}

}
