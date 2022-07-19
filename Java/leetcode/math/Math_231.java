package math;

public class math_231 {

	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		return (n - 1 & n) == 0;
	}

	public static void main(String[] args) {
		// Power of Two
		int n = 1;
		System.out.println(isPowerOfTwo(n));

	}

}
