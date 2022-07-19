package math;

public class Math_342 {

	public static boolean isPowerOfFour(int n) {

		if (n <= 0) {
			return false;
		}

		int num = 0;

		while (n > 1) {
			num = n % 4;

			if (num != 0) {
				return false;
			}

			n = n / 4;
		}
		return n == 1 ? true : false;

	}

	public static void main(String[] args) {
		// Power of Four
		int n = 5;
		System.out.println(isPowerOfFour(n));
	}

}
