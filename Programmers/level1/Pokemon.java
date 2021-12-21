package level1;

import java.util.HashSet;

public class Pokemon {

	public static int solution(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int max = nums.length / 2;

		for (int num : nums) {
			set.add(num);
		}

		if (set.size() > max) {
			return max;
		} else {
			return set.size();
		}
	}

	public static void main(String[] args) {
		// ÆùÄÏ¸ó
		int[] nums = { 3, 1, 2, 3 };
		System.out.println(solution(nums));

	}

}
