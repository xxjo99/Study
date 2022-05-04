package level1;

import java.util.ArrayList;

public class SameNumber {

	public static int[] solution(int[] arr) {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(arr[0]);

		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr2.get(count)) {
				arr2.add(arr[i]);
				count++;
			}
		}

		int[] answer = new int[arr2.size()];
		for (int i = 0; i < arr2.size(); i++) {
			answer[i] = arr2.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		// 같은 숫자는 싫어
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = solution(arr);

		for (int i : arr2) {
			System.out.println(i);
		}
	}

}
