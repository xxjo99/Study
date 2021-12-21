package level1;

import java.util.*;

public class Marathon2 {

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for (i = 0; i < completion.length; i++) {

			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i];
	}

	public static void main(String[] args) {
		// 완주하지 못한 선수
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "mislav", "ana" };

		System.out.println(solution(participant, completion));

	}

}
