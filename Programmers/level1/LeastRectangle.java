package level1;

public class LeastRectangle {

	public static int solution(int[][] sizes) {

		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				int a = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = a;
			}
		}

		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] > max1) {
				max1 = sizes[i][0];
			}
			if (sizes[i][1] > max2) {
				max2 = sizes[i][1];
			}
		}

		int answer = max1 * max2;

		return answer;
	}

	public static void main(String[] args) {
		// 최소직사각형
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		
		System.out.println(solution(sizes));

	}

}
