package level1;

public class Average {

	public static double solution(int[] arr) {
		double answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		
		answer = answer / arr.length;
		
		return answer;
	}

	public static void main(String[] args) {
		// ��� ���ϱ�
		int[] arr = { 5, 5 };
		System.out.println(solution(arr));

	}

}
