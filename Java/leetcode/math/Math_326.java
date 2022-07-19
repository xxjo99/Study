package math;

public class Math_326 {

	public static boolean isPowerOfThree(int n) {

		if (n <= 0) {
			return false;
		}

		int num = 0;

		while (n > 1) {
			num = n % 3;

			if (num != 0) {
				return false;
			}

			n = n / 3;
		}
		return n == 1 ? true : false;

	}

	public static void main(String[] args) {
		// Power of Three
		int n = 0;
		System.out.println(isPowerOfThree(n));
	}

}
