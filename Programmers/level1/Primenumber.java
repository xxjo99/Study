package level1;

public class Primenumber {

	public static boolean isPrime(int num) {
		boolean result = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int n = nums[i] + nums[j] + nums[k];

					if (isPrime(n)) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// 소수 만들기
		int[] nums = { 1, 2, 7, 6, 4 };

		System.out.println(solution(nums));

	}

}
