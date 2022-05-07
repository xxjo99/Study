package arrays101;

import java.util.Arrays;

public class Arrays101_3 {

	public static int[] sortedSquares(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i] * nums[i];
			nums[i] = a;
		}
		
		Arrays.sort(nums);
		
		return nums;
	}

	public static void main(String[] args) {
		// Find Numbers with Even Number of Digits
		int[] nums = { -7, -3, 2, 3, 11 };
		int[] result = sortedSquares(nums);
		for (int i : result) {
			System.out.println(i);
		}

	}

}
