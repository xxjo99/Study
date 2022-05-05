package array_Easy;

public class array_Easy_27 {
	
    public static int removeElement(int[] nums, int val) {
    	int index = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != val) {
    			nums[index++] = nums[i];
    		}
    	}
    	
    	return index;    	
    }

	public static void main(String[] args) {
		// 27. Remove Element
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		System.out.println(removeElement(nums, val));
	}

}
