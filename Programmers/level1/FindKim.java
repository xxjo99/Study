package level1;

public class FindKim {

	public static String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "�輭���� " + i + "�� �ִ�";
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		String[] seoul = { "Jane", "Kim" };
		System.out.println(solution(seoul));

	}

}
