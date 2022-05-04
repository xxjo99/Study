package level1;
import java.util.Arrays;

public class Budget {
	
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
        	budget -= d[i];
        	if (budget < 0) {
        		break;
        	}
        	answer++;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// ¿¹»ê
		int[] d = { 1, 2, 3, 4, 5 };
		int budget = 9;
		System.out.println(solution(d, budget));

	}

}
