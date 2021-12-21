package level1;

public class Collatz {

	public static int solution(double num) {
		int answer = 0;

		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = 3 * num + 1;
			}

			answer++;
			
			if (answer == 500) {
				answer = -1;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 콜라츠 추측
		double num = 626331;
		System.out.println(solution(num));

	}

}
