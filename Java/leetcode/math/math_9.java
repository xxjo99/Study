package math;

public class math_9 {

	public static boolean isPalindrome(int x) {
		
		if (x < 0) {
			return false;
		} else {
			String s = Integer.toString(x);
			StringBuffer sb = new StringBuffer(s);
			String reverse = sb.reverse().toString();
			
			if (s.equals(reverse) == true) {
				return true;
			} else {
				return false;
			}
			
		}

	}

	public static void main(String[] args) {
		// Palindrome Number
		int x = 121;
		System.out.println(isPalindrome(x));
		
	}

}
