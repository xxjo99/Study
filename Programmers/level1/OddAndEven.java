package level1;

public class OddAndEven {
	
    public static String solution(int num) {
        if (num == 0) {
        	return "Even";
        } else if (num % 2 == 0) {
        	return "Even";
        } else {
        	return "Odd";
        }
    }

	public static void main(String[] args) {
		// Â¦¼ö¿Í È¦¼ö
		int num = 0;
		System.out.println(solution(num));
	}

}
