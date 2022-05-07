package arrays101;

public class Arrays101_1 {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int count = 0;
		
		for (int i : nums) {
			if (i == 1) {
				count++;
				if (result < count) {
					result = count;
				} 
			} else {
				count = 0;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// Max Consecutive Ones
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));

	}

}
