package arrays101;

public class Arrays101_10 {
	
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] % 2 == 0) {
        		result[idx] = nums[i];
        		idx++;
        	}
        }
        
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] % 2 != 0) {
        		result[idx] = nums[i];
        		idx++;
        	}
        }
        
        return result;
    }

	public static void main(String[] args) {
		// Sort Array By Parity
		int[] nums = { 3, 1, 2, 4 };
		int[] result = sortArrayByParity(nums);
		
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

}
