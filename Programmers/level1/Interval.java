package level1;

public class Interval {

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long a = x;

		for (int i = 0; i < n; i++) {
			answer[i] = a * (i + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		// x��ŭ ������ �ִ� n���� ����
		int x = -4;
		int n = 2;
		long[] arr = solution(x, n);
		for (long i : arr) {
			System.out.println(i);
		}

	}

}
