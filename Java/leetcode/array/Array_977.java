package array;

import java.util.Arrays;

public class Array_977 {

	public static int[] sortedSquares(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i] * nums[i];
			nums[i] = a;
		}
		
		Arrays.sort(nums);
		
		return nums;
	}

	public static void main(String[] args) {
		// Squares of a Sorted Array
		int[] nums = { -7, -3, 2, 3, 11 };
		int[] result = sortedSquares(nums);
		for (int i : result) {
			System.out.println(i);
		}

	}

}
