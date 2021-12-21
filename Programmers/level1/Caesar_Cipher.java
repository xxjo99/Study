package level1;

public class Caesar_Cipher {

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}

			answer += ch;
		}

		return answer;
	}

	public static void main(String[] args) {
		// 시저암호
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s, n));

	}

}
