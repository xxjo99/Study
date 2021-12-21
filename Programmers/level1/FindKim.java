package level1;

public class FindKim {

	public static String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String[] seoul = { "Jane", "Kim" };
		System.out.println(solution(seoul));

	}

}
