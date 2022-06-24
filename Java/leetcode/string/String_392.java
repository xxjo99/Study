package string;

public class String_392 {

	public static boolean isSubsequence(String s, String t) {

		if (s.length() == 0) {
			return true;
		}

		int count = 0;
		for (int i = 0; i < t.length(); i++) {
			
			if (s.charAt(count) == t.charAt(i)) {
				
				if (++count == s.length()) {
					return true;
				}
				
			}

		}
		
		return false;

	}

	public static void main(String[] args) {
		// Is Subsequence
		String s = "abc";
		String t = "ahbgdc";

		System.out.print(isSubsequence(s, t));
	}

}
