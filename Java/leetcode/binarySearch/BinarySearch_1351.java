package binarySearch;

public class BinarySearch_1351 {

	public int countNegatives(int[][] grid) {
		int count = 0;
		for (int[] row : grid) {
			for (int v : row) {
				if (v < 0) {
					count++;
				}
			}
		}
		return count;
	}

}
