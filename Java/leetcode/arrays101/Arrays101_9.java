package arrays101;

public class Arrays101_9 {

	public static void moveZeroes(int[] nums) {
		
		int index = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}
		
		while (index < nums.length) {
			nums[index] = 0;
			index++;
		}
 
	}

	public static void main(String[] args) {
		// Move Zeroes
		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeroes(arr);

	}

}
