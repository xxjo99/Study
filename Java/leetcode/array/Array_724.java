package array;

public class Array_724 {

	public static int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			int sum = 0;
			
			for (int j = 0; j <= i; j++) {
				sum += nums[j];
			}
			
			result[i] = sum;			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// 1480. Running Sum of 1d Array
		int[] nums = { 1, 2, 3, 4 };
		
		int[] result = runningSum(nums);
		
		for (int i : result) {
			System.out.println(i);
		}
	}

}
