package arrays101;

public class Arrays101_2 {

	public static int findNumbers(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			int len = (int) (Math.log10(n) + 1);

			if (len % 2 == 0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// Find Numbers with Even Number of Digits
		int[] nums = { 555, 901, 482, 1771 };
		System.out.println(findNumbers(nums));

	}

}
