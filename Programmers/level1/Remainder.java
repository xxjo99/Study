package level1;

public class Remainder {
	
    public static int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i < n; i++) {
        	if (n % i == 1) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// �������� 1�� �Ǵ� �� ã��
		int n = 12;
		System.out.println(solution(n));

	}

}
