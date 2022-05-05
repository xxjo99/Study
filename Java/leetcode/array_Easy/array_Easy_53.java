package array_Easy;

public class array_Easy_53 {

	public static int maxSubArray(int[] nums) {
		int ans = nums[0];
		int subMax = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			subMax = Math.max(subMax + nums[i], nums[i]);
			ans = Math.max(subMax, ans);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// 53. Maximum Subarray
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

}
