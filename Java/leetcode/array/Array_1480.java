package array;

public class Array_1480 {

	public static int pivotIndex(int[] nums) {
		int result = -1;
		int sum = 0;

		for (int i = 1; i < nums.length; i++) {
			sum += nums[i];
		}

		if (sum == 0) {
			result = 0;
		} else {

			for (int i = 1; i < nums.length; i++) {

				if (i == nums.length) {
					for (int j = 0; j < i; j++) {
						sum += nums[j];
					}

					if (sum == 0) {
						result = i;
					}
				} else {
					int sum1 = 0;
					int sum2 = 0;

					for (int j = 0; j < i; j++) {
						sum1 += nums[j];
					}

					for (int j = i + 1; j < nums.length; j++) {
						sum2 += nums[j];
					}

					if (sum1 == sum2) {
						result = i;
						break;
					}

				}

			}
		}

		return result;
	}

	public static void main(String[] args) {
		// 724. Find Pivot Index
		int[] nums = { -1, -1, 0, 0, -1, -1 };
		System.out.println(pivotIndex(nums));
	}

}
