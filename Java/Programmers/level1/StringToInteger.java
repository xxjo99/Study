package level1;

public class StringToInteger {

	public static int solution(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		// 문자열을 정수로 바꾸기
		String s = "-1234";
		System.out.println(solution(s));

	}

}
