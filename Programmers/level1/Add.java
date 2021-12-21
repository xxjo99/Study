package level1;

public class Add {

	public static long solution(int a, int b) {
		long answer = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		return answer;
	}

	public static void main(String[] args) {
		// 두 정수 사이의 합
		int a = 5;
		int b = 3;
		System.out.println(solution(a, b));

	}

}
