package level1;

public class StrangeWord {

	public static String solution(String s) {
		String[] arr = s.split(" ", -1);

		String answer = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				char a = arr[i].charAt(j);

				if (j == 0 || j % 2 == 0) {
					answer += Character.toUpperCase(a);
				} else {
					answer += Character.toLowerCase(a);
				}

			}
			if (!(i == arr.length-1)) {
				answer += " ";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 이상한 문자 만들기
		String s = "try hello world";
		System.out.println(solution(s));
	}

}
