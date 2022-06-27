package array;

public class Array_66 {

	public static int[] plusOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {
			digits[i]++;

			if (digits[i] < 10) {
				return digits;
			}

			digits[i] = 0;
		}

		int[] res = new int[n + 1];
		res[0] = 1;

		return res;
	}

	public static void main(String[] args) {
		// 66. Plus One
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int[] result = plusOne(digits);

		for (int i : result) {
			System.out.println(i);
		}

	}

}