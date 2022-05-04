package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisible {

	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		int[] answer;
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		} else {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
			return answer;
		}

	}

	public static void main(String[] args) {
		// 나누어 떨어지는 숫자 배열
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 1;
		int[] arr2 = solution(arr, divisor);
		for (int i : arr2) {
			System.out.println(i);
		}

	}

}
