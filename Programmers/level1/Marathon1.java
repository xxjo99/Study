package level1;

public class Marathon1 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		for (int i = 0; i < completion.length; i++) {
			for (int j = 0; j < participant.length; j++) {

				if (completion[i].equals(participant[j])) {
					completion[i] = null;
					participant[j] = null;
					break;
				}
				
			}
		}
		
		for (int i = 0; i < participant.length; i++) {
			if (participant[i] != null) {
				answer = participant[i];
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// 완주하지 못한 선수
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "mislav", "ana" };

		System.out.println(solution(participant, completion));

	}

}
