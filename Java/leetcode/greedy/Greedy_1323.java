package greedy;

public class Greedy_1323 {

	public static int maximum69Number (int num) {
    	
    	String s = Integer.toString(num);
    	int result = Integer.parseInt(s.replaceFirst("6", "9"));
    	return result;
 
    	
    }

	public static void main(String[] args) {
		int num = 9669;

		System.out.println(maximum69Number(num));
	}

}
