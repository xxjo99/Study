package array;

public class Array_35 {

	public static int searchInsert(int[] nums, int target) {
		if (target < nums[0]) {
			return 0;
		}
		if (target > nums[nums.length - 1]) {
			return nums.length;
		}

		int low = 0;
		int high = nums.length - 1;
		int mid;

		while (low < high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (target > nums[mid]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// 35. Search Insert Position
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchInsert(nums, target));
	}

}
