package arrays101;

public class Arrays101_4 {

	public static void duplicateZeros(int[] arr) {
		int zeroCount = 0;

		for (int a : arr) {
			if (a == 0) {
				zeroCount++;
			}
		}

		int n = arr.length;

		for (int i = n - 1; i >= 0; i--) {
			int j = i + zeroCount;

			if (arr[i] == 0) {
				if (j < n) {
					arr[j] = 0;
				}
				zeroCount--;
				j--;
			}

			if (j < n) {
				arr[j] = arr[i];
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// Duplicate Zeros
		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		duplicateZeros(arr);

	}

}
