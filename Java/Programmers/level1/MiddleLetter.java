package level1;

public class MiddleLetter {

	public static String solution(String s) {
		String answer = "";

		int n = s.length() / 2;
		if (s.length() % 2 == 1) {
			char a = s.charAt(n);
			answer = String.valueOf(a);
		} else {
			char a = s.charAt(n - 1);
			String c = String.valueOf(a);
			char b = s.charAt(n);
			String d = String.valueOf(b);
			answer = c + d;		
		}

		return answer;
	}

	public static void main(String[] args) {
		// 가운데 글자 가져오기
		String s = "abcde";
		String a = "qwer";
		
		System.out.println(solution(s));
		System.out.println(solution(a));

	}

}
