package level1;
import java.util.ArrayList;

public class Min {

	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int min = 1000000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (min != arr[i]) {
				list.add(arr[i]);
			}
		}
		
		if (list.size() == 0) {
			int[] answer = {-1};
			return answer;
		} else {
			int[] answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			return answer;
		}
		
	}

	public static void main(String[] args) {
		// 제일 작은 수 제거하기
		int[] arr = { 10 };
		int[] answer = solution(arr);
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
