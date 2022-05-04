package level1;

public class measure {
	
    public static int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
        	int count = 0;
        	
        	for (int j = 1; j * j <= i; j++) {
        		if (i % 1 == 0) {
        			count++;
        			if (j * j < i) {
        				count++;
        			}
        		} 
        	}
        	
        	if (count % 2 == 0) {
        		answer += i;
        	} else {
        		answer -= i;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// ¾à¼öÀÇ °³¼ö¿Í µ¡¼À
		int left = 24;
		int right = 27;
		
		System.out.println(solution(left, right));

	}

}
