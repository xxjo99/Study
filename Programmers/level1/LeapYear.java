package level1;

public class LeapYear {
	
    public static String solution(int a, int b) {
    	
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int add = b;
        for (int i = 0; i < a - 1; i++) {
        	add += month[i];
        }
        add %= 7;
        
        String answer;
        
        if (add == 0) {
        	answer = week[6];
        } else {
        	answer = week[add-1];
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 2016³â
		int a = 12;
		int b = 31;
		
		System.out.println(solution(a, b));

	}

}
