package array;

public class Array_1299 {

	public static int[] replaceElements(int[] arr) {
		int[] replaceArr = new int[arr.length];

		if (arr.length == 1) {
			replaceArr[0] = -1;
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				int max = -1;

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] > max) {
						max = arr[j];
					}
				}

				replaceArr[i] = max;

			}
		}
		replaceArr[replaceArr.length - 1] = -1;

		return replaceArr;
	}

	public static void main(String[] args) {
		// Replace Elements with Greatest Element on Right Side
		int[] arr = { 17, 18, 5, 4, 6, 1 };
		int[] result = replaceElements(arr);		
		
		for (int i : result) {
			System.out.println(i);
		}
		
	}

}
