package array_Easy;

public class array_Easy_1 {
	
    public static int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	
    	for (int i = 0; i < nums.length - 1; i++) {
    		for (int j = i+1; j < nums.length; j++) {
    			int sum = nums[i] + nums[j];
    			
    			if (sum == target) {
    				result[0] = i; 
    				result[1] = j;
    				break;
    			}
    			
    		}
     	}
    	
    	return result;
    }

	public static void main(String[] args) {
		// 1. Two Sum
		int[] nums = {2, 5, 5, 11};
		int target = 10;
		
		int[] result = twoSum(nums, target);
		
		for (int i : result) {
			System.out.println(i);
		}
	}

}
