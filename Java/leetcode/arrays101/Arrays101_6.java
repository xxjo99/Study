package arrays101;

public class Arrays101_6 {

	public static boolean checkIfExist(int[] arr) {
		boolean check = false;

		Loop1: for (int i = 0; i < arr.length - 1; i++) {
			int a = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				int b = arr[j];

				if (a == b * 2 || b == a * 2) {
					check = true;
					break Loop1;
				}

			}
		}

		return check;
	}

	public static void main(String[] args) {
		// Check If N and Its Double Exist
		int[] arr = { 7, 1, 14, 11 };
		System.out.println(checkIfExist(arr));
	}

}
