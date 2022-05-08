package arrays101;

import java.util.Arrays;

public class Arrays101_11 {

	public static int heightChecker(int[] heights) {
		int[] expected = heights.clone();
		Arrays.sort(expected);

		int check = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expected[i]) {
				check++;
			}
		}

		return check;
	}

	public static void main(String[] args) {
		// Height Checker
		int[] nums = { 5, 1, 2, 3, 4 };
		int result = heightChecker(nums);
		System.out.println(result);

	}

}
