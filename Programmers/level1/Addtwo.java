package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Addtwo {

	public static int[] solution(int[] numbers) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int add = numbers[i] + numbers[j];

				if (list.contains(add) == false) {
					list.add(add);
				}

			}
		}
		
		answer = list.stream().mapToInt(Integer :: intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		// �� �� �̾Ƽ� ���ϱ�
		int[] numbers = { 5,0,2,7 };
		int[] answer = solution(numbers);
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
