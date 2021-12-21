package level1;

public class NumToArray {

	public static int[] solution(long n) {
		String s = Long.toString(n);

		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		String[] arr = sb.toString().split("");
		int[] answer = new int[sb.length()];

		for (int i = 0; i < sb.length(); i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		// �ڿ��� ������ �迭�� �����
		long n = 12345;
		int[] answer = solution(n);
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
