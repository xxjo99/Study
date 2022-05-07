package arrays101;

public class Arrays101_5 {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;
		int i = m - 1;
		int j = n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] < nums2[j]) {
				nums1[index--] = nums2[j--];
			} else {
				nums1[index--] = nums1[i--];
			}
		}

		while (j >= 0) {
			nums1[index--] = nums2[j--];
		}

	}

	public static void main(String[] args) {
		// Merge Sorted Array
		int[] arr1 = {};
		int m = 0;
		int[] arr2 = { 1 };
		int n = 1;
		merge(arr1, m, arr2, n);
	}

}
