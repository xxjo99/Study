package array;

public class Array_26 {
	
    public static int removeDuplicates(int[] nums) {
    	int result = 1;
    	
    	if (nums.length == 0) {
    		return 0;
    	} else {
    		for (int i = 1; i < nums.length; i++) {
    			if (nums[i] != nums[i-1]) {
    				nums[result] = nums[i];
    				result++;
    			}
    		}    		
    	}
    	
    	return result;
    	
    }

	public static void main(String[] args) {
		// 26. Remove Duplicates from Sorted Array
		int[] nums = {1, 1, 2};
		System.out.println(removeDuplicates(nums));
	}

}
